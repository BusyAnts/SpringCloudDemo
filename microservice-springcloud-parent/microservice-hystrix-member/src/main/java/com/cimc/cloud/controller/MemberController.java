package com.cimc.cloud.controller;

import com.cimc.cloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2020-03-11 14:39
 */
@RestController
@RequestMapping("member")
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/getMember_OK/{id}")
    public String getMember_OK(@PathVariable("id") Long id) {
        String result = memberService.getMember_OK(id);
        log.info("*****result:" + result);
        return result;
    }

    @GetMapping("/getMember_Timeout/{id}")
    public String getMember_Timeout(@PathVariable Long id) {
        String result = memberService.getMember_Timeout(id);
        log.info("*****result:" + result);
        return result;
    }

    @GetMapping("/circuit/{id}")
    public String getMemberCircuitBreaker(@PathVariable Integer id) {
        String result = memberService.getMemberCircuitBreaker(id);
        log.info("*****result:" + result);
        return result;
    }
}
