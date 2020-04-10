package com.cimc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenz
 * @create 2019-08-26 11:29
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberZipkinApplication.class, args);
    }
}
