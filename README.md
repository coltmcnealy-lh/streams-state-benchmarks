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

It takes three arguments:

1. Number of workflows to run concurrently.
2. The output size (in bytes) of each simulated "TaskRun".
3. The number of simulated TaskRun's to run in the workflow.

Note that each simulated "workflow" involves 100 simulated "TaskRuns". Therefore, running the following command would run 123 simulated Workflows, each with 100 simulated TaskRuns that have a 1KB payload each.

```
gradle run --args 'launchTests 123 1000 100'
```

In the above command, the compacted storage should be about `123 * (100 * 1000 + change)`, or roughly 13-15MB. Due to repeated writes, the un-compacted state used on your disk will be considerably greater.

### `workflowMetrics`

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

* `totalTaskStarts` is the number of simulated TaskRun's that started in this window.
* `totalTaskStartLatency` is the total time spent waiting from between Task A finishing and Task B starting. Use `totalTaskStartLatency / totalTaskStarts` to determine the average latency between tasks. _This is a critical metric for LittleHorse._
* `maxTaskStartLatency` is the longest time between Task A finishing and Task B starting in any workflow.
* `totalTaskCompletes` is the total number of simulated TaskRuns that were completed within a metrics window.
* `totalTaskCompleteLatency` is the total sum of latency between a simulated TaskRun starting and completing. Use `totalTaskCompleteLatency / totalTaskCompletes` to calculate the average time taken to process a simulated TaskRun.
* `maxTaskCompleteLatency` is the maximum time between a TaskRun starting and ending.

### `streamsMetrics`

This command is a convenience command that prints out all of the Kafka Streams metrics at the `debug` level.

```
gradle run --args 'streamsMetrics`
```

### Debug Reset

To clear the Kafka Streams state and delete all topics, you can stop the server process and run:

```
./debug_refresh.sh
```

### Cleanup
```
docker-compose down
rm -r /tmp/kafkaState
```

## Example Benchmarks (RocksDB)

I ran some benchmarks on my own with RocksDB and have recorded my observations.

### Fresh Start Small Tasks
This is a baseline workload with:

* 1 thousand simulated Workflows running concurrently.
* 2 KB task payload size.
* 1 thousand task runs per simulated workflow, for one million total simulated TaskRuns.
* Estimated 2.5-3 GB total storage

The command I used was:
```
gradle run --args 'launchTests 1000 2000 1000
```

Workflow metrics were as follows:

```
{
  "metrics": [{
    "totalTaskStarts": "267830",
    "totalTaskStartLatency": "9643153",
    "maxTaskStartLatency": "635",
    "totalTaskCompletes": "267000",
    "totalTaskCompleteLatency": "8778775",
    "maxTaskCompleteLatency": "620",
    "windowStart": "2023-04-07T20:20:00Z"
  }, {
    "totalTaskStarts": "614268",
    "totalTaskStartLatency": "14880171",
    "maxTaskStartLatency": "217",
    "totalTaskCompletes": "615000",
    "totalTaskCompleteLatency": "15122029",
    "maxTaskCompleteLatency": "209",
    "windowStart": "2023-04-07T20:20:30Z"
  }, {
    "totalTaskStarts": "117902",
    "totalTaskStartLatency": "8013113",
    "maxTaskStartLatency": "7468",
    "totalTaskCompletes": "118000",
    "totalTaskCompleteLatency": "8207349",
    "maxTaskCompleteLatency": "7484",
    "windowStart": "2023-04-07T20:21:00Z"
  }]
}
```

Interesting metrics:

* The average task start latency across all three metrics windows was 33ms.
* The start-to-finish of the test was 70 seconds.
* After allowing RocksDB a few minutes to compact, there are 2.1GB of state in the state directory.

### Putting Larger Values

Well, that's pretty good performance. What happens when we grow the state a bit? To grow the state, I decided to run 1 million more task runs (resulting in another 2M or so net new keys added) but make the task size a bit bigger so we add 10GB instead of 2GB.

```
gradle run --args 'launchTests 1000 10000 1000
```
This time we have:

* 1,000 simulated workflows.
* 10KB data per simulated task run.
* 1,0000 task runs per workflow.

The test took 8:49 minutes, as opposed to 1:10 for the smaller one. This is curious, since the test involved exactly the same amount of reads/writes, and only 5x larger payloads (for some of the writes). Yet it's more than a 5x slowdown.

The state directory finished up around 12GB of usage, which is 10GB more than we started with (as expected). It appears that compaction is roughly working.

Punctuators (range scans with deletes) took about 1000-2000 milliseconds each and processed around 150k items initially.

Around task 100 (early in the test), we had:

* `put-latency-avg: 80016.07672190186`
* `put-latency-max: 5.881019581E9`

Around task 500 (halfway through the test, when state was around 7GB), we had:

* `put-latency-avg: 63802.151975203975`
* `put-latency-max: 4.289848192E9`

Around task 800 (later in the test, when the state was nearing 10GB), we had:

* `put-latency-avg: 87270.62264379485`
* `put-latency-max: 1.0684463753E10`

### Revisiting Original Workload with a Saturated RocksDB

Now I run the original test with 2KB simulated task runs but with RocksDB already holding 12GB of state. Recall that the first one took 1:10 minutes for everything to complete.

```
gradle run --args 'launchTests 1000 2000 1000'
```

This time, it took 1:18 (which is only modestly slower than 1:10 for the small state). One of the punctuator range scans took 5217ms, which is _really_ slow.

Task Start latency average increased from 33ms to 39ms. The largest task start latency was 6370ms, which was likely right after the long punctuator.

We've determined now that at 12GB, the performance of a LittleHorse partition is about 5-15% worse than when it's empty. That's not horrible.

Note that the disk space usage in the state dir is now 14GB.

### Moving to 24GB
Let's see what happens when we get up to 24GB. To do that, let's first add 10GB to the state store by running the following:
```
gradle run --args 'launchTests 1000 10000 1000'
```

This experiment took 13:20 minutes. Recall that the first time we did this, it was 8:49.

Upon completion of the exercise, it appeared that compaction hadn't really done its job. The state store was over 40GB rather than the expected 24GB. CPU usage of the app was high, implying ongoing compaction. The number of SST files 90 seconds after the last record was processed was 987; it later grew to 1096.

During compaction, the total disk usage grew all the way to 67GB before abruptly falling to 24GB after 3:50 minutes. CPU usage calmed down, and now there are only 379 SST files.

The takeaway here is that the compaction couldn't really handle the extra throughput, and things took much longer.

### Running Smaller Tasks Starting at 24GB
Now let's go back to our more standard workload: 2kb tasks. After compaction, this should add another 2GB to the data store.

```
gradle run --args 'launchTests 1000 2000 1000'
```
This time, it took 1:36 minutes from when the first record was produced to the last record being processed, as opposed to 1:18 at 12GB and 1:10 on an empty RocksDB. That's a 37% performance loss over the original speed.

It should also be noted that we waited for compaction to complete before starting this test. In production, we normally wouldn't stop the world for four minutes to let RocksDB do its thing.

## Example Benchmarks RocksDB LOG enabled

This is the benchmark for which I have provided the db logs. It was run with the DB logging enabled; the benchmark above was run without logging enabled.

I ran the following command:

```
for i in $(seq 1 20); do gradle run --args 'launchTests 1000 1000 1000' ;  done
```

It essentially launches 20 rounds of 1GB of work each. It's a total of 40M input records in Kafka. What is interesting is how long it takes from launching that command to having it complete.

Each "Task Run" has 1KB of data. This is pretty much the average size we would expect in production LittleHorse (~100 bytes of output, 900 bytes of internal metadata).

*THIS IS A VERY GOOD BENCHMARK TO OPTIMIZE*

* The actual processing took: 33:29
* After compaction, 22GB were used in RocksDB (27GB in changelog topic)
* Restoration took about 17:45, which is not significantly faster than the processing.
* Disk space usage ballooned up to 72G during the restoration.


## Open Questions
Some of the following questions relate to the underlying storage engine; others relate to the broker side of things.

### Processing Disruptions With Large Task Payloads

When doing the tests, you will see that there are bumpy "pauses" when it looks like processing gets stuck for 1-2 seconds at a time. I haven't confirmed for sure what causes that, but I hypothesize it is due to rocksdb compaction. This will make it much harder for LittleHorse to meet a p99 latency SLA.

It should also be noted that the pauses don't really occur with small amounts of state.

### Maximum "Safe" Partition Size

How big is too big for data in one partition of a State Store? My very unscientific poll in the Kafka Streams slack channel (probably aged out by now) shows that around 20-35GB per partition, there start to be various issues with memory usage in RocksDB, broker compaction, super-long restore times, etc.

My benchmarks in this repository supported that unscientific poll by showing that performance starts to degrade a little around 10GB, and the degradation becomes sharp around 24GB. 

SpeedB might hopefully make it feasible to grow larger.

#### Broker-Side Compaction

Much ado has been made about RocksDB compaction taking longer and being less efficient when the total SST size grows beyond 30GB or so. But don't forget that compaction also happens on the Kafka Broker side, and if there are 10GB in a RocksDB store, there is a corresponding partition with 10GB in the changelog topic.

I think a good follow-up to this paper would be doing some profiling of compaction performance on the broker side as partition size grows. It seems like it's wise to keep each partition to 10GB or less.

#### Many Partitions, KIP-500
[Yugabyte](https://yugabyte.com) is my favorite example of a well-designed distributed database. They use a modified version of RocksDB as their storage engine. Yugabyte shards each RocksDB instance once it reaches 10GB of data, but it can support up to 64k "tablets" (shards). It has been proven to work in production systems with over 200TB of data.

Streams gets a bad rap for storing large amounts of state. But I hypothesize that most of those issues (slow restoration times, RocksDB performance hits as state grows, inelasticity of moving state over) could be mitigated if a given topology had 500-1000 partitions rather than 20-50 partitions.

Many smaller partitions would enable:

* Greater RocksDB/SpeedB performance as each instance is smaller.
* Faster restoration time for a given partition.
* More efficient compaction on the broker side (smaller partitions to compact).

However, there are two downsides to this:

1. ZooKeeper Kafka has a limit to how many partitions it can feasibly manage.
2. There is overhead to running lots of RocksDB instances.

Well, KIP-500 makes item 1 much less of a concern as Kafka can run with 10x the number of partitions with the same performance.

Having 2,000 input partitions would allow LittleHorse to safely manage 20TB of data. However, with the LH Topology that would mean 6,000 RocksDB instances _before_ standby replicas. Obviously, such a large deployment would involve a few dozen streams instances, so probably 250 stores per instance. And that has been done before and isn't a huge issue.

# Note: Compiling with SpeedB

First, we're going to remove the RocksDB JNI so that we're certain we're using the correct SpeedB JNI. Let's compile the Uber-Jar:

```
./gradlew shadowJar
```

Next, navigate to `app/build/libs/` and then:

```
unzip app-all.jar -d app-all

rm -r app-all/librocksdbjni-*

jar cvf app-without-speedb.jar -C app-all .
```

Then, try running:

```
java -cp ./app-without-speedb.jar benchmark.speedb.App server
```

That should fail since we got rid of the RocksDB JNI and haven't yet put in the SpeedB one. To add SpeedB, let's download it (on my system, it's at `~/Downloads/speedbjni-2.3.0-linux64.jar`)

```
mkdir -p /tmp/speedb-surgery
cd /tmp/speedb-surgery

unzip ~/Downloads/speedbjni-2.3.0-linux64.jar -d speedb-jni-dir
```

If you do `ls speedb-jni-dir`, you should see a file like: `libspeedbjni-linux64.so`. 

Navigate back to the `app/build/libs/` directory. Then:

```
cp /tmp/speedb-surgery/speedb-jni-dir/libspeedbjni-linux64.so app-all/librocksdbjni-linux64.so

jar cvf app-with-speedb.jar -C app-all .
```

Now, when you try to run the app it should work:

```
java -cp ./app-with-speedb.jar benchmark.speedb.App server
```
