package com.springboot.demo.sharding.strategy;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author ldb
 * @date 2020-03-20 10:25
 * @description 自定义数据库分片策略, 采用轮询算法
 */
@Slf4j
public class RoundRobinShardingDatabaseAlgorithm implements PreciseShardingAlgorithm<Long> {

    final static String DB_PREFIX = "master";

    @Override
    public String doSharding(Collection<String> databaseNames, PreciseShardingValue<Long> shardingValue) {
        // shardingValue:PreciseShardingValue(logicTableName=s_order, columnName=order_id, value=447710946723364864)
        log.info("shardingValue:{}", shardingValue);
        // 得到下标
        long index = shardingValue.getValue() % databaseNames.size();
        String dbName = DB_PREFIX + index;
        log.info("操作数据库：{}", dbName);
        return dbName;
    }


}
