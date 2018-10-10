package com.zrthas.entity.role;

/**
 * @program: antnest
 * @description: 角色信息
 * @author: zrthas
 * @create: 2018-10-10 15:37
 **/
public class RoleEntity {

    public String roleId;
    public String roleName;
    public String roleRemark;
    public String roleCreateBy;
    public String roleParentId;
    public String roleStatus;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    public String getRoleCreateBy() {
        return roleCreateBy;
    }

    public void setRoleCreateBy(String roleCreateBy) {
        this.roleCreateBy = roleCreateBy;
    }

    public String getRoleParentId() {
        return roleParentId;
    }

    public void setRoleParentId(String roleParentId) {
        this.roleParentId = roleParentId;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }
}
