package com.cimc.cloud.controller;

import com.cimc.cloud.api.MemberApi;
import com.cimc.cloud.entity.User;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2020-03-10 13:50
 */
@RestController
public class MemberController implements MemberApi {

    @Override
    public User getMember(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("James");
        user.setAge(35);
        return user;
    }
}
