package com.zrthas.entity.relationship;

/**
 * @program: antnest
 * @description: 用户与角色的关系
 * @author: zrthas
 * @create: 2018-10-10 14:54
 **/
public class RoleAndUserEntity {
    public String roleId;
    public String userId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
