package com.qinghuanet.service.impl;

import com.qinghuanet.domain.User;
import com.qinghuanet.mapper.UserMapper;
import com.qinghuanet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 17:31
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查询
     * @param ids
     * @return
     */
    @Override
    public List<User> findByIds(List<Integer> ids) {
        return userMapper.findByIds(ids);
    }
}
