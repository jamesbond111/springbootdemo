package com.bili;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

@SpringBootApplication
public class Main {
    //测试冲突1
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

