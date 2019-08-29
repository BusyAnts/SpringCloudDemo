package com.cimc.cloud.feign.fallback;

import com.cimc.cloud.entity.User;
import com.cimc.cloud.feign.MemberFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenz
 * @create 2019-08-29 10:57
 */
@Component
@RequestMapping("/member/fallback")
public class MemberFeignClientFallback implements MemberFeignClient {

    @Override
    public User getMember(Long id) {
        System.out.println("执行服务降级处理，返回默认用户：id: " + id);
        User user = new User();
        user.setId(id);
        user.setName("降级默认用户james");
        user.setAge(80);
        return user;
    }
}
