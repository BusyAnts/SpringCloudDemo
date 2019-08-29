package com.cimc.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenz
 * @create 2019-08-26 13:24
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "orderToMemberFallback")
    @GetMapping("/orderToMember/{id}")
    public String orderToMember(@PathVariable Long id) {
        System.out.println("orderToMember:" + "当前线程池名称:" + Thread.currentThread().getName());
        return restTemplate.getForObject("http://microservice-service-member/member/getMember/" + id, String.class);
    }

    public String orderToMemberFallback(Long id, Throwable throwable) {
        System.out.println("error:" + throwable);
        System.out.println("执行服务降级处理，返回默认用户：id: " + id);
        return "执行服务降级处理，返回默认用户：id: " + id;
    }

}
