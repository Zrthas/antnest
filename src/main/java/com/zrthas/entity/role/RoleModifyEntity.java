package com.zrthas.entity.role;

import java.util.Date;

/**
 * @program: antnest
 * @description: 角色修改信息
 * @author: zrthas
 * @create: 2018-10-10 15:39
 **/
public class RoleModifyEntity {
    public String roleModifyId;
    public String roleId;
    public String roleModifyBy;
    public Date roleModifyTime;
    public String roleModifyParentId;
    public String roleModifyDeptId;
    public String roleModifyName;
    public String roleBeforeDeptId;
    public String roleBeforeRemark;
    public String roleBeforeParentId;

    public String getRoleModifyId() {
        return roleModifyId;
    }

    public void setRoleModifyId(String roleModifyId) {
        this.roleModifyId = roleModifyId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleModifyBy() {
        return roleModifyBy;
    }

    public void setRoleModifyBy(String roleModifyBy) {
        this.roleModifyBy = roleModifyBy;
    }

    public Date getRoleModifyTime() {
        return roleModifyTime;
    }

    public void setRoleModifyTime(Date roleModifyTime) {
        this.roleModifyTime = roleModifyTime;
    }

    public String getRoleModifyParentId() {
        return roleModifyParentId;
    }

    public void setRoleModifyParentId(String roleModifyParentId) {
        this.roleModifyParentId = roleModifyParentId;
    }

    public String getRoleModifyDeptId() {
        return roleModifyDeptId;
    }

    public void setRoleModifyDeptId(String roleModifyDeptId) {
        this.roleModifyDeptId = roleModifyDeptId;
    }

    public String getRoleModifyName() {
        return roleModifyName;
    }

    public void setRoleModifyName(String roleModifyName) {
        this.roleModifyName = roleModifyName;
    }

    public String getRoleBeforeDeptId() {
        return roleBeforeDeptId;
    }

    public void setRoleBeforeDeptId(String roleBeforeDeptId) {
        this.roleBeforeDeptId = roleBeforeDeptId;
    }

    public String getRoleBeforeRemark() {
        return roleBeforeRemark;
    }

    public void setRoleBeforeRemark(String roleBeforeRemark) {
        this.roleBeforeRemark = roleBeforeRemark;
    }

    public String getRoleBeforeParentId() {
        return roleBeforeParentId;
    }

    public void setRoleBeforeParentId(String roleBeforeParentId) {
        this.roleBeforeParentId = roleBeforeParentId;
    }
}
