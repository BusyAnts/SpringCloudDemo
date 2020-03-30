package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenz
 * @create 2020-03-29 16:54
 */
@SpringBootApplication
@EnableEurekaClient
public class BusClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusClientApplication.class, args);
    }
}
