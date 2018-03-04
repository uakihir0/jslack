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

    public Login() {
    }

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

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Login)) return false;
        final Login other = (Login) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$dateFirst = this.getDateFirst();
        final Object other$dateFirst = other.getDateFirst();
        if (this$dateFirst == null ? other$dateFirst != null : !this$dateFirst.equals(other$dateFirst)) return false;
        final Object this$dateLast = this.getDateLast();
        final Object other$dateLast = other.getDateLast();
        if (this$dateLast == null ? other$dateLast != null : !this$dateLast.equals(other$dateLast)) return false;
        final Object this$count = this.getCount();
        final Object other$count = other.getCount();
        if (this$count == null ? other$count != null : !this$count.equals(other$count)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        final Object this$userAgent = this.getUserAgent();
        final Object other$userAgent = other.getUserAgent();
        if (this$userAgent == null ? other$userAgent != null : !this$userAgent.equals(other$userAgent)) return false;
        final Object this$isp = this.getIsp();
        final Object other$isp = other.getIsp();
        if (this$isp == null ? other$isp != null : !this$isp.equals(other$isp)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$region = this.getRegion();
        final Object other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $dateFirst = this.getDateFirst();
        result = result * PRIME + ($dateFirst == null ? 43 : $dateFirst.hashCode());
        final Object $dateLast = this.getDateLast();
        result = result * PRIME + ($dateLast == null ? 43 : $dateLast.hashCode());
        final Object $count = this.getCount();
        result = result * PRIME + ($count == null ? 43 : $count.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        final Object $userAgent = this.getUserAgent();
        result = result * PRIME + ($userAgent == null ? 43 : $userAgent.hashCode());
        final Object $isp = this.getIsp();
        result = result * PRIME + ($isp == null ? 43 : $isp.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $region = this.getRegion();
        result = result * PRIME + ($region == null ? 43 : $region.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Login;
    }

    public String toString() {
        return "Login(userId=" + this.getUserId() + ", username=" + this.getUsername() + ", dateFirst=" + this.getDateFirst() + ", dateLast=" + this.getDateLast() + ", count=" + this.getCount() + ", ip=" + this.getIp() + ", userAgent=" + this.getUserAgent() + ", isp=" + this.getIsp() + ", country=" + this.getCountry() + ", region=" + this.getRegion() + ")";
    }
}
