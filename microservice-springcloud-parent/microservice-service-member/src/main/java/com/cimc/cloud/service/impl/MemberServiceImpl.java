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
        user.setName("james");
        user.setAge(35);
        return user;
    }

    @Override
    public User getMember(Long id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(36);
        return user;
    }
}
