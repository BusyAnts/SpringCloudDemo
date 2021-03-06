package com.cimc.cloud.service;

import com.cimc.cloud.entity.User;

/**
 * @author chenz
 * @create 2019-08-26 11:33
 */
public interface IMemberService {

    /**
     * 根据id查找
     * @param id
     * @return
     */
    User getMember(Long id);
}
