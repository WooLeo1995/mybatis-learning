package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;

/**
 * @author qinghua
 * @date 2018/6/21 16:11
 */
public interface UserMapper {

    /**
     * 根据id查询
     * @return
     */
    User findById(Integer id);

    /**
     * 修改
     * @param user
     */
    void updateEmail(User user);
}
