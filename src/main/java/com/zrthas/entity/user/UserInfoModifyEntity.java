package com.zrthas.entity.user;

import java.util.Date;

/**
 * @program: antnest
 * @description: 用户修改信息记录
 * @author: zrthas
 * @create: 2018-10-10 14:40
 **/
public class UserInfoModifyEntity {
    public String userId;
    public String userModifyInfo;
    public String userModifyIp;
    public Date userModifyTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserModifyInfo() {
        return userModifyInfo;
    }

    public void setUserModifyInfo(String userModifyInfo) {
        this.userModifyInfo = userModifyInfo;
    }

    public String getUserModifyIp() {
        return userModifyIp;
    }

    public void setUserModifyIp(String userModifyIp) {
        this.userModifyIp = userModifyIp;
    }

    public Date getUserModifyTime() {
        return userModifyTime;
    }

    public void setUserModifyTime(Date userModifyTime) {
        this.userModifyTime = userModifyTime;
    }
}
