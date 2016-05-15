package me.skyline.modules.login.entity;

import java.util.Date;

public class UserInfo {
    private String userId;

    private String email;

    private String prePwd;

    private String nowPwd;

    private String nickName;

    private String realName;

    private String sex;

    private Date birthDay;

    private String country;

    private String province;

    private String city;

    private String addr;

    private String mobileNo;

    private String iconUrl;

    private String iconFlg;

    private Integer iconWidth;

    private Integer iconHeight;

    private Integer loginNum;

    private Date lastLoginTime;

    private String lastLoginIpAddr;

    private String ident;

    private Date identPeriod;

    private String status;

    private Date addDate;

    private String addUserId;

    private String addIpAddr;

    private Date updDate;

    private String updUserId;

    private String updIpAddr;

    private String token;

    private String openId;

    private String delFlg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPrePwd() {
        return prePwd;
    }

    public void setPrePwd(String prePwd) {
        this.prePwd = prePwd == null ? null : prePwd.trim();
    }

    public String getNowPwd() {
        return nowPwd;
    }

    public void setNowPwd(String nowPwd) {
        this.nowPwd = nowPwd == null ? null : nowPwd.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    public String getIconFlg() {
        return iconFlg;
    }

    public void setIconFlg(String iconFlg) {
        this.iconFlg = iconFlg == null ? null : iconFlg.trim();
    }

    public Integer getIconWidth() {
        return iconWidth;
    }

    public void setIconWidth(Integer iconWidth) {
        this.iconWidth = iconWidth;
    }

    public Integer getIconHeight() {
        return iconHeight;
    }

    public void setIconHeight(Integer iconHeight) {
        this.iconHeight = iconHeight;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIpAddr() {
        return lastLoginIpAddr;
    }

    public void setLastLoginIpAddr(String lastLoginIpAddr) {
        this.lastLoginIpAddr = lastLoginIpAddr == null ? null : lastLoginIpAddr.trim();
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident == null ? null : ident.trim();
    }

    public Date getIdentPeriod() {
        return identPeriod;
    }

    public void setIdentPeriod(Date identPeriod) {
        this.identPeriod = identPeriod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
    }

    public String getAddIpAddr() {
        return addIpAddr;
    }

    public void setAddIpAddr(String addIpAddr) {
        this.addIpAddr = addIpAddr == null ? null : addIpAddr.trim();
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

    public String getUpdUserId() {
        return updUserId;
    }

    public void setUpdUserId(String updUserId) {
        this.updUserId = updUserId == null ? null : updUserId.trim();
    }

    public String getUpdIpAddr() {
        return updIpAddr;
    }

    public void setUpdIpAddr(String updIpAddr) {
        this.updIpAddr = updIpAddr == null ? null : updIpAddr.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }
}