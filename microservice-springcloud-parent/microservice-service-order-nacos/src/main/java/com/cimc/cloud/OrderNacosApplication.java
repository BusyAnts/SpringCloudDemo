package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenz
 * @create 2019-08-26 13:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication.class, args);
    }
}
