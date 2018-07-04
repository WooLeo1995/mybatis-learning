package com.qinghuanet.service;

import com.qinghuanet.domain.User;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 17:30
 */
public interface UserService {

    List<User> findByIds(List<Integer> ids);
}
