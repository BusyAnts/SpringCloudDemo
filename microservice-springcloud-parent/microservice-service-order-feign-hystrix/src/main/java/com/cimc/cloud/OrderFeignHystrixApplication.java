package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenz
 * @create 2019-08-27 8:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixApplication.class, args);
    }
}
