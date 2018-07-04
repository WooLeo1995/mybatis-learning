package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/21 16:11
 */
public interface UserMapper {

    /**
     * 查询，使用where标签
     * @param user
     * @return
     */
    List<User> findWithWhere(User user);

    /**
     * 修改，使用set标签
     * @return
     */
    void updateWithSet(User user);

    /**
     * 查询，使用trim标签
     * @param user
     * @return
     */
    List<User> findWithTrim(User user);

    /**
     * 修改，使用trim标签
     * @param user
     */
    void updateWithTrim(User user);
}
