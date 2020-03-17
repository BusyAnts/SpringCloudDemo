package com.cimc.cloud.feign;

import com.cimc.cloud.entity.User;
import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenz
 * @create 2019-08-27 9:01
 */
@FeignClient(name = "microservice-service-member", configuration = MemberFeignClient.MemberFeignConfig.class)
@RequestMapping("/member")
public interface MemberFeignClient {

    /**
     * 获取会员信息的feign接口
     *
     * @param id
     * @return
     */
    @GetMapping("/getMember/{id}")
    User getMember(@PathVariable("id") Long id);

/*    *//**
     * 多参数处理1
     * @param user
     * @return
     *//*
    @GetMapping("/getMember")
    User get0(@SpringQueryMap User user);

    *//**
     * 多参数处理2
     * @param id
     * @param name
     * @return
     *//*
    @GetMapping("/getMember")
    User get1(@RequestParam("id") Long id, @RequestParam("name") String name);

    *//**
     * 多参数处理3
     * @param map
     * @return
     *//*
    @GetMapping(value = "/getMember")
    User get2(@RequestParam Map<String, Object> map);*/

    @PostMapping(value = "/member")
    User member(@RequestBody User user);

    /**
     * 该Feign Client的配置类，注意：
     * 1. 该类可以独立出去；
     * 2. 该类上也可添加@Configuration声明是一个配置类；
     * 配置类上也可添加@Configuration注解，声明这是一个配置类；
     * 但此时千万别将该放置在主应用程序上下文@ComponentScan所扫描的包中，
     * 否则，该配置将会被所有Feign Client共享，无法实现细粒度配置！
     * 个人建议：像我一样，不加@Configuration注解
     */
    class MemberFeignConfig {
        @Bean
        public Logger.Level logger() {
            return Logger.Level.FULL;
        }
    }

}


