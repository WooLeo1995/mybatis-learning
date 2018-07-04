package com.qinghuanet.mapper;

import com.qinghuanet.domain.City;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 13:15
 */
public interface CityMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    City findById(Integer id);

    /**
     * 根据省份id查询
     * @param provinceId
     * @return
     */
    List<City> findByProvinceId(Integer provinceId);
}
