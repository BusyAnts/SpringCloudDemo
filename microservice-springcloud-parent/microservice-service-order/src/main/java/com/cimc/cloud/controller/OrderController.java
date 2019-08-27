package com.cimc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author chenz
 * @create 2019-08-26 13:24
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 原始调用方式
     * @param id
     * @return
     */
    @GetMapping("/orderToMemberOri/{id}")
    public String orderToMemberOri(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:7901/member/getMember/" + id, String.class);
    }

    @GetMapping("/orderToMember/{id}")
    public String orderToMember(@PathVariable Long id) {
        return restTemplate.getForObject("http://microservice-service-member/member/getMember/" + id, String.class);
    }

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public List<ServiceInstance> discovery() {
        // 获取所有服务名
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        // 获取microservice-service-member服务信息
        List<ServiceInstance> srvList = client.getInstances("microservice-service-member");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return srvList;
    }


}
