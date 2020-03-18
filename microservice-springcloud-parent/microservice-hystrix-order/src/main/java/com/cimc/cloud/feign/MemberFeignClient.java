package com.cimc.cloud.feign;

import com.cimc.cloud.feign.fallback.MemberFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenz
 * @create 2020-03-11 16:24
 */
@FeignClient(value = "microservice-hystrix-member", fallback = MemberFeignClientFallback.class)
@RequestMapping("member")
public interface MemberFeignClient {
    @GetMapping("/getMember_OK/{id}")
    String getMember_OK(@PathVariable("id") Long id);

    @GetMapping("/getMember_Timeout/{id}")
    String getMember_Timeout(@PathVariable Long id);

}
