package com.github.seratch.jslack.api.model;

public class Login {

    private String userId;
    private String username;
    private Integer dateFirst;
    private Integer dateLast;
    private Integer count;
    private String ip;
    private String userAgent;
    private String isp;
    private String country;
    private String region;

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public Integer getDateFirst() {
        return this.dateFirst;
    }

    public Integer getDateLast() {
        return this.dateLast;
    }

    public Integer getCount() {
        return this.count;
    }

    public String getIp() {
        return this.ip;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public String getIsp() {
        return this.isp;
    }

    public String getCountry() {
        return this.country;
    }

    public String getRegion() {
        return this.region;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDateFirst(Integer dateFirst) {
        this.dateFirst = dateFirst;
    }

    public void setDateLast(Integer dateLast) {
        this.dateLast = dateLast;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
