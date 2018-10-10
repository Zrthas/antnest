package com.zrthas.entity.user;

/**
 * @program: antnest
 * @description: 用户详情
 * @author: zrthas
 * @create: 2018-10-10 14:35
 **/
public class UserInfoEntity {
    public String userId;
    public Integer userSex;
    public String userPassword;
    public String userPhone;
    public String userWechat;
    public String userEmail;
    public String userBirthday;
    public String userRegIp;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserRegIp() {
        return userRegIp;
    }

    public void setUserRegIp(String userRegIp) {
        this.userRegIp = userRegIp;
    }
}
