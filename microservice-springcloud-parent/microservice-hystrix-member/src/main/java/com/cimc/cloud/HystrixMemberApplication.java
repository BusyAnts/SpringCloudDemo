package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author chenz
 * @create 2020-03-11 14:28
 */
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixMemberApplication.class, args);
    }
}
