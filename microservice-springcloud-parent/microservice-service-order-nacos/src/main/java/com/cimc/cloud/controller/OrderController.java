package com.cimc.cloud.controller;

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

    @GetMapping("/orderToMember/{id}")
    public String orderToMember(@PathVariable Long id) {
        return restTemplate.getForObject("http://microservice-service-member-nacos/member/getMember/" + id, String.class);
    }
}
