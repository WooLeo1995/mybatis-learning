package com.qinghuanet.domain;

/**
 * @author qinghua
 * @date 2018/6/22 11:04
 */
public class Birthday {

    private String year;
    private String month;
    private String day;

    /**
     * 无参构造
     */
    public Birthday() { }

    /**
     * 全参构造
     * @param year
     * @param month
     * @param day
     */
    public Birthday(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * 使用 yyyy-MM-dd 格式字符串构建Birthday对象
     * @param birthday
     */
    public Birthday(String birthday) {
        String[] split = birthday.split("-");
        this.year = split[0];
        this.month = split[1];
        this.day = split[2];
    }

    /**
     * 获取当前Birthday yyyy-MM-dd 格式的字符串值
     * @return
     */
    public String getBirthday() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    /**
     * 重写 toString
     * @return
     */
    @Override
    public String toString() {
        return this.getBirthday();
    }

    //getter/setter
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
