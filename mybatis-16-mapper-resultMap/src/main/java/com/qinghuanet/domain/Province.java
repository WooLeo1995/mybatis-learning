package com.qinghuanet.domain;

import java.util.List;

/**
 * @author qinghua
 * @date 2018/6/22 13:11
 */
public class Province {

    private Integer id;
    private String name;

    private List<City> citys;

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

    public List<City> getCitys() {
        return citys;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
    }
}
