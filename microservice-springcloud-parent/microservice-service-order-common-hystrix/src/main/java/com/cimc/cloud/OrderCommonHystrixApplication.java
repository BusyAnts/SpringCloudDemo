package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenz
 * @create 2019-08-29 13:40
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderCommonHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderCommonHystrixApplication.class, args);
    }
}
