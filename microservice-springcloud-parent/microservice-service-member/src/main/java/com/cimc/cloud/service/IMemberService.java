package com.cimc.cloud.service;

import com.cimc.cloud.entity.User;

/**
 * @author chenz
 * @create 2019-08-26 11:33
 */
public interface IMemberService {

    /**
     * 根据id获取会员信息
     * @param id
     * @return
     */
    User getMember(Long id);

    /**
     * 根据id，姓名查找
     * @param id
     * @param name
     * @return
     */
    User getMember(Long id,String name);
}
