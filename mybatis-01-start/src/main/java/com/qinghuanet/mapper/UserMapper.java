package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/21 15:15
 */
public interface UserMapper {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 根据name模糊查询
     * @param name
     * @return
     */
    List<User> findByNameWithLike(String name);

    /**
     * 保存
     * @param user
     */
    void save(User user);

    /**
     * 修改
     * @param user
     */
    void update(User user);

    /**
     * 删除
     * @param id
     */
    void deleteById(Integer id);
}
