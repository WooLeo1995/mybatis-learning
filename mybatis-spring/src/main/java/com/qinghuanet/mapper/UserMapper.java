package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 17:06
 */
public interface UserMapper {

    /**
     * 根据id查询
     * @param ids
     * @return
     */
    List<User> findByIds(List<Integer> ids);
}
