package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/21 16:11
 */
public interface UserMapper {

    /**
     * 模糊查询
     * @return
     */
    List<User> findWithLike(User user);
}
