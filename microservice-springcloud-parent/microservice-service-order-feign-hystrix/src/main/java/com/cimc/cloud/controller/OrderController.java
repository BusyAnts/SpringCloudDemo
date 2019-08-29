package com.cimc.cloud.controller;

import com.cimc.cloud.feign.MemberFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2019-08-27 9:05
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private MemberFeignClient memberFeignClient;

    @GetMapping("/orderToMember/{id}")
    public String orderToMember(@PathVariable Long id) {
        return memberFeignClient.getMember(id).toString();
    }
}
