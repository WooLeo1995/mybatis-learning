package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;
import com.qinghuanet.domain.VO;

import java.util.List;
import java.util.Map;

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
     * 根据vo对象查询
     * @param vo
     * @return
     */
    List<User> findByVO(VO vo);

    /**
     * 根据map参数查询
     * @param param
     * @return
     */
    List<User> findByMap(Map<String, String> param);
}
