package com.qinghuanet.mapper;

import com.qinghuanet.domain.User;
import org.apache.ibatis.annotations.Param;

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
    List<User> findByIds(List<Integer> ids);

    /**
     * 批量保存
     * @param map
     */
    void batchSave(@Param("users") Map<String, User> map);
}
