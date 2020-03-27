package com.cimc.cloud.controller;

import com.cimc.cloud.config.ServiceInfoUtil;
import com.cimc.cloud.entity.User;
import com.cimc.cloud.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenz
 * @create 2019-08-26 11:38
 */
@RestController
@RequestMapping("member")
public class MemberController {
    @Autowired
    private IMemberService memberService;

    @GetMapping("/getMember/{id}")
    public User getMember(@PathVariable Long id) {
        System.out.println(ServiceInfoUtil.getPort());
        //模拟耗时请求
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return memberService.getMember(id);
    }

    @GetMapping("/getMember")
    public User getMember(@RequestParam Long id, @RequestParam String name) {
        return memberService.getMember(id, name);
    }

    @PostMapping("/member")
    public User member(@RequestBody User user) {
        return user;
    }
}
