package benchmark.speedb;

import java.util.Map;
import org.apache.kafka.streams.state.RocksDBConfigSetter;
import org.rocksdb.InfoLogLevel;
import org.rocksdb.Options;
import org.rocksdb.Statistics;

public class RocksConfigSetter implements RocksDBConfigSetter {

    private Statistics stats;

    @Override
    public void setConfig(
        final String storeName,
        final Options options,
        final Map<String, Object> configs
    ) {
        System.out.println("Hello, there!");
        options.setInfoLogLevel(InfoLogLevel.DEBUG_LEVEL);
    }

    @Override
    public void close(final String storeName, final Options options) {
        System.out.println("Closing store");
    }
}
