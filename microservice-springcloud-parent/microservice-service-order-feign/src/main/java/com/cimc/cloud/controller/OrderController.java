package com.cimc.cloud.controller;

import com.cimc.cloud.entity.User;
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

/*    @GetMapping("/orderToMember")
    public String orderToMember(User user) {
        return memberFeignClient.get0(user).toString();
    }

    @GetMapping("/orderToMember1")
    public String orderToMember1(User user) {
        return memberFeignClient.get1(user.getId(), user.getName()).toString();
    }

    @GetMapping("/orderToMember2")
    public String orderToMember2(User user) {
        Map<String, Object> map = new HashMap<>(10);
        map.put("id", user.getId());
        map.put("name", user.getName());
        return memberFeignClient.get2(map).toString();
    }*/

    @GetMapping("/member")
    public String member(User user) {
        return memberFeignClient.member(user).toString();
    }
}
