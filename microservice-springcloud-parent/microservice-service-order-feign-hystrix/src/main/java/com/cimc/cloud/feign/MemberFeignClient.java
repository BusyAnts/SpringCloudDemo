package com.cimc.cloud.feign;

import com.cimc.cloud.entity.User;
import com.cimc.cloud.feign.fallback.MemberFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenz
 * @create 2019-08-27 9:01
 */
@FeignClient(name = "microservice-service-member", fallback = MemberFeignClientFallback.class)
@RequestMapping("/member")
public interface MemberFeignClient {

    /**
     * 获取会员信息的feign接口
     *
     * @param id
     * @return
     */
    @GetMapping("/getMember/{id}")
    User getMember(@PathVariable("id") Long id);
}

