package com.qinghuanet.domain;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 13:10
 */
public class City {

    private Integer id;
    private String name;

    private List<District> districts;
    private Province province;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
