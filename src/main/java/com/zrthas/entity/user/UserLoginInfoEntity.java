package com.zrthas.entity.user;

import java.util.Date;

/**
 * @program: antnest
 * @description: 用户登录信息
 * @author: zrthas
 * @create: 2018-10-10 14:43
 **/
public class UserLoginInfoEntity {
    public String userId;
    public Date userLoginTime;
    public String userLoginIp;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Date userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public String getUserLoginIp() {
        return userLoginIp;
    }

    public void setUserLoginIp(String userLoginIp) {
        this.userLoginIp = userLoginIp;
    }
}
