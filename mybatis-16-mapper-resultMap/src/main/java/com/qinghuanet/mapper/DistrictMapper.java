package com.qinghuanet.mapper;

import com.qinghuanet.domain.District;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 13:14
 */
public interface DistrictMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    District findById(Integer id);

    /**
     * 根据城市id查询
     * @param cityId
     * @return
     */
    List<District> findByCityId(Integer cityId);
}
