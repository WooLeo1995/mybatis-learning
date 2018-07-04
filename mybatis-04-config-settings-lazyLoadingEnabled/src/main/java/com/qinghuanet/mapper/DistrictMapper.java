package com.qinghuanet.mapper;

import com.qinghuanet.domain.District;

/**
 * @author qinghua
 * @date 2018/6/21 17:46
 */
public interface DistrictMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    District findById(Integer id);
}
