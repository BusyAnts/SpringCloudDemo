package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenz
 * @create 2020-03-28 16:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class BusServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusServerApplication.class, args);
    }
}
