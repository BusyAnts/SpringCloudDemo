package com.cimc.cloud.controller;

import com.cimc.cloud.config.ServiceInfoUtil;
import com.cimc.cloud.entity.User;
import com.cimc.cloud.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2019-08-26 11:38
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private IMemberService memberService;

    @GetMapping("/getMember/{id}")
    public User getMember(@PathVariable Long id) {
        System.out.println(ServiceInfoUtil.getPort());
        return memberService.getMember(id);
    }
}
