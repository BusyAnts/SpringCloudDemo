package com.cimc.cloud.config;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenz
 * @create 2020-03-10 9:52
 */
@EnableFeignClients(defaultConfiguration = DefaultFeignConfig.class)
public class FeignClientDefaultConfiguration {
}

@Configuration
class DefaultFeignConfig {

    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }

}
