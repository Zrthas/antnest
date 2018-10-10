package com.zrthas.entity.relationship;

/**
 * @program: antnest
 * @description: 部门与角色关系
 * @author: zrthas
 * @create: 2018-10-10 14:45
 **/
public class DepartmentAndRoleEntity {
    public String deptId;
    public String roleId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
