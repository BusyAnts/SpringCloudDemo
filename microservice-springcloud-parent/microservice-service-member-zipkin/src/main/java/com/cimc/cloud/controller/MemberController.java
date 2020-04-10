package com.cimc.cloud.controller;

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

    @GetMapping("/getMemberZipkin/{id}")
    public User getMemberZipkin(@PathVariable Long id) {
        return memberService.getMember(id);
    }
}
