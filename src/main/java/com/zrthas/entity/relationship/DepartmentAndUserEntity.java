package com.zrthas.entity.relationship;

/**
 * @program: antnest
 * @description: 用户与部门关系
 * @author: zrthas
 * @create: 2018-10-10 14:50
 **/
public class DepartmentAndUserEntity {
    public String deptId;
    public String userId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
