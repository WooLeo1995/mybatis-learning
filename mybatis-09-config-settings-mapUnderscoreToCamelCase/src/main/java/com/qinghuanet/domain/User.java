package com.qinghuanet.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qinghua
 * @date 2018/6/21 15:14
 */
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private String userMobile;
    private Date userBirthday;
    private String userEmail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userBirthday=" + userBirthday +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
