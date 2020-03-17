package com.cimc.cloud.controller;

import com.cimc.cloud.api.OrderApi;
import com.cimc.cloud.feign.MemberFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2020-03-10 14:21
 */
@RestController
public class OrderController implements OrderApi {

    @Autowired
    private MemberFeignClient memberFeignClient;

    @Override
    public String getOrder(Long id) {
        return memberFeignClient.getMember(id).toString();
    }
}
