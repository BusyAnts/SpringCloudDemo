package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenz
 * @create 2019-08-26 13:19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class OrderHystrixCommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixCommonApplication.class, args);
    }
}
