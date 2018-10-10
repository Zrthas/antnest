package com.zrthas.entity.user;

/**
 * 对应数据库表：t_base_user
 * 字段在数据库有备份
 *
 * @author zrthas
 */
public class UserEntity {

    private String userId;
    private String userName;
    private String userLoginName;
    private String userIdentityType;
    private String userStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserIdentityType() {
        return userIdentityType;
    }

    public void setUserIdentityType(String userIdentityType) {
        this.userIdentityType = userIdentityType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
