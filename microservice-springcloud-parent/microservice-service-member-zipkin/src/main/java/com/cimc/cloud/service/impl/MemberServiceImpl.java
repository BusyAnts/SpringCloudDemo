package com.cimc.cloud.service.impl;

import com.cimc.cloud.entity.User;
import com.cimc.cloud.service.IMemberService;
import org.springframework.stereotype.Service;

/**
 * @author chenz
 * @create 2019-08-26 11:36
 */
@Service
public class MemberServiceImpl implements IMemberService {

    @Override
    public User getMember(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("James");
        user.setAge(36);
        return user;
    }
}
