package com.cimc.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenz
 * @create 2019-08-27 13:27
 */
@RibbonClients(defaultConfiguration = DefaultRibbonConfig.class)
public class RibbonClientDefaultConfiguration {

}

@Configuration
class DefaultRibbonConfig {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
