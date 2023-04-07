# One-Partition State Store Benchmark

This repository exercises a single `KeyValueStore` on a single partition with a read/write workload that is highly similar to that of _LittleHorse Enterprises LLC_'s "LittleHorse Runtime" workflow engine.

LittleHorse has a goal of being able to handle throughput of 30MB/s written to the state stores (across all partitions) with a 14-day retention period to support the upper limit of what potential clients want (and to compete with Temporal's upper limit). This is about 20TB of data being stored in state stores.

I've seen reports of a State Store with 8TB across 70 partitions (Nick Telford) in the Confluent Community slack. However, he strongly recommended NOT following suit as the experience was quite unstable.

## Workload Characteristics
LittleHorse uses Kafka Streams to implement a Workflow Engine. Every time a task is executed, the state of the workflow is updated, and a "TaskRun" is saved in the database. Metrics are also calculated using a self-implemented sort of window store. TaskRun's can have variable size payloads--some are small and some are large.

This Streams Topology nearly exactly mimics the load on the State Store implementation that is observed in the actual LittleHorse Runtime. In particular, the various characteristics are:

* Repeated writes (and reads) to the same key over several seconds or minutes as a Workflow progresses.
    * These writes are interspersed with many other keys which are also read/written to repeatedly, since many Workflows run in parallel.
* Range scans on portions of the state store in a punctuator.
    * In LittleHorse, we use this to implement a "timer service" which allows the workflow scheduler to schedule events that it will process at some later time in the future.
    * The most common use-case for the timer service is to put a "timeout" on a TaskRun.
    * During the Range Scan, other key-value pairs (outside of the range) may be modified. For example, we may encounter a "Timer" that is a task timeout, and therefore we will update a separate TaskRun to mark it as failed.
* Deletion of key/value pairs during a Range Scan.

For somewhat obvious reasons, _LittleHorse Enterprises_ couldn't release code for our working Workflow Engine implementation. However, the Topology (and driver client) in this repository produce an equivalent workload on a single RocksDB/SpeedB instance in a one-partition Kafka Streams topic.

### One Big State Store
An astute reader of the code will notice that there are multiple object types stored in a single `KeyValueStore<String, Bytes>`. This is on purpose. The actual LittleHorse implementation originally used multiple stores--one for each object type. This led to about two dozen distinct state stores. The Kafka Consumer Rebalance took about 30 seconds with 72 input partitions and only one Streams instance.

However, when we combined all the stores into one, and implemented a wrapper which segregates the stores logically with a prefix, the group rebalance time with 72 input partitions fell to three seconds (10x speedup).

Of the two dozen original LH state stores, most of the data volume was consumed by one of them. Therefore, spreading it out among the other 20 stores didn't really avoid the need for the individual state store to be able to handle a lot of data.

## Building and Running

* Make sure no processes are running on ports `9092` or `5000` on your local machine.
* Make sure you have `gradle`, `java` 17 or later, and `docker-compose` installed.
* Run your Kafka cluster:
    * `docker-compose up -d`

Next, run the project via `gradle`, using one of the commands described below:

### `setup`

```
gradle run --args 'setup'
```
This command creates the required kafka topics for the topology.

### `server`
Run this command in a separate terminal and leave it running:

```
gradle run --args 'server'
```

It starts the Streams topology and exposes a metrics server.

### `launchTests`

This command launches a series of simulated "Workflows" which mimic the same workload on RocksDB as what we see in the actual LittleHorse server. It should be run in a separate terminal while the Streams Topology (step above) is also running.

It takes two arguments:

1. Number of workflows to run concurrently.
2. The output size (in bytes) of each simulated "TaskRun".

Note that each simulated "workflow" involves 100 simulated "TaskRuns". Therefore, running the following command would run 123 simulated Workflows, each with 100 simulated TaskRuns that have a 1KB payload each.

```
gradle run --args 'launchTests 123 1000'
```

In the above command, the compacted storage should be about `123 * (100 * 1000 + change)`, or roughly 13-15MB. Due to repeated writes, the un-compacted state used on your disk will be considerably greater.

### `workflowMetrcs`

This topology keeps track of simulated performance metrics that closely mirror those that are important to the LittleHorse Workflow Engine. the `workflowMetrics` command prints out a timeseries of those metrics. It takes one command--the number of metrics windows to display (each metrics window is calculated over thirty seconds).

To display metrics for the last five 30-second windows, you can run:

```
gradle run --args 'workflowMetrics 5'
```

Note that the Kafka Streams Topology must be running in another terminal.

Each Metrics Window looks like the following:
```
{
    "timestamp": // the start of the 30-second window.

    "totalTaskStarts": <long>
    "totalTaskStartLatency": <long>
    "maxTaskStartLatency": <long>

    "totalTaskCompletes": <long>
    "totalTaskCompleteLatency": <long>
    "maxTaskCompleteLatency": <long>

    "messagesProcessed": <long>
}
```



### `streamsMetrics`

This command is a convenience command that prints out all of the Kafka Streams metrics at the `debug` level.

```
gradle run --args 'streamsMetrics`
```

### Cleanup
```
docker-compose down
rm -r /tmp/kafkaState
```

## Example Benchmarks (RocksDB)

I ran some benchmarks on my own with RocksDB and have recorded my observations.

### Fresh Start Small Tasks


### Fresh Start Large Tasks


### Large State Small Tasks


## Open Questions
Some of the following questions relate to the underlying storage engine; others relate to the broker side of things.

### Processing Disruptions With Large Task Payloads

### Maximum "Safe" Partition Size

#### Broker-Side Compaction

#### Many Partitions: KIP-848, KIP-500
[Yugabyte](https://yugabyte.com) is my favorite example of a well-designed distributed database. They use a modified version of RocksDB as their storage engine. Yugabyte shards each RocksDB instance once it reaches 10GB of data, but it can support up to 64k "tablets" (shards). It has been proven to work in production systems with over 200TB of data.

Streams gets a bad rap for storing large amounts of state. But I hypothesize that most of those issues (slow restoration times, RocksDB performance hits as state grows, inelasticity of moving state over) could be mitigated if a given topology had 500-1000 partitions rather than 20-50 partitions.

Many smaller partitions would enable:

* Greater RocksDB/SpeedB performance as each instance is smaller.
* Faster restoration time for a given partition.
* More efficient compaction on the broker side (smaller partitions to compact).

However, there are two downsides to this:

1. ZooKeeper Kafka has a limit to how many partitions it can feasibly manage.
2. Consumer Group Rebalances take longer with more partitions.

Well, KIP-500 makes item 1 much less of a concern as Kafka can run with 10x the number of partitions with the same performance.

And KIP-848 hopes to make it so that consumer instances are unaffected by a rebalance unless their assignments change. This would mean that _perhaps_ having many more small partitions would be reasonable.

