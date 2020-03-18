package com.cimc.cloud.feign.fallback;

import com.cimc.cloud.feign.MemberFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenz
 * @create 2020-03-16 21:15
 */
@Component
@RequestMapping("member/fallback")
public class MemberFeignClientFallback implements MemberFeignClient {
    @Override
    public String getMember_OK(Long id) {
        return "getMember_OK Fallback";
    }

    @Override
    public String getMember_Timeout(Long id) {
        return "getMember_Timeout Fallback";
    }
}
