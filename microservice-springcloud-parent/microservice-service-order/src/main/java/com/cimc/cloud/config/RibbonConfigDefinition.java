package com.cimc.cloud.config;

import config.MyRibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定的目标服务自定义配置。
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 *
 * @author chenz
 * @create 2019-08-26 14:51
 */
@Configuration
@RibbonClient(name = "microservice-service-member", configuration = MyRibbonConfiguration.class)
public class RibbonConfigDefinition {
}
