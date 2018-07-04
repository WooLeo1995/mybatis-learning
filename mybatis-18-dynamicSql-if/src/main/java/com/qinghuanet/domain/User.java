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

    public User() {
    }

    public User(Integer id, String name, String mobile, Date birthday, String email) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.birthday = birthday;
        this.email = email;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }
}
