package com.bili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

@SpringBootApplication
public class Main {
    //测试冲突1
    // 测试git commit -am
    //测试git commit -am --amend 111
    //sdf 111
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

