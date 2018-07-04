package com.qinghuanet.mapper;

import com.qinghuanet.domain.Province;

/**
 * @author qinghua
 * @date 2018/6/22 13:16
 */
public interface ProvinceMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Province findById(Integer id);
}
