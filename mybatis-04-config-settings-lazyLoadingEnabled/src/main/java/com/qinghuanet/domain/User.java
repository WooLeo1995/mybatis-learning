package com.qinghuanet.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qinghua
 * @date 2018/6/21 15:14
 */
public class User implements Serializable {

    private Integer id;
    private String name;
    private String mobile;
    private Date birthday;
    private String email;
    private District district;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", district=" + district +
                '}';
    }
}
