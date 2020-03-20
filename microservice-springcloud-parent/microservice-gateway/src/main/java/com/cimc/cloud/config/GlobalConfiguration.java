package com.cimc.cloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

/**
 * @author chenz
 * @create 2020-03-20 15:10
 */
//@Configuration
@Slf4j
public class GlobalConfiguration {

    @Bean
    @Order(-1)
    public GlobalFilter a() {
        return (exchange, chain) -> {
            log.info("a pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("a post filter");
            }));
        };
    }

    @Bean
    @Order(0)
    public GlobalFilter b() {
        return (exchange, chain) -> {
            log.info("b pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("b post filter");
            }));
        };
    }

    @Bean
    @Order(1)
    public GlobalFilter c() {
        return (exchange, chain) -> {
            log.info("c pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("c post filter");
            }));
        };
    }

}
