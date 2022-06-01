package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class, args);
    }
}
