package com.qinghuanet.domain;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 13:10
 */
public class District {

    private Integer id;
    private String name;

    private City city;

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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
