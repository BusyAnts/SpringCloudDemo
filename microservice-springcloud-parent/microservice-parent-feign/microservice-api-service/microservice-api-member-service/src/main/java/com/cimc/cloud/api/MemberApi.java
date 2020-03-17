package com.cimc.cloud.api;

import com.cimc.cloud.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenz
 * @create 2020-03-10 13:31
 */
@RequestMapping("member")
public interface MemberApi {

    @GetMapping("/getMember/{id}")
    User getMember(@PathVariable Long id);

}
