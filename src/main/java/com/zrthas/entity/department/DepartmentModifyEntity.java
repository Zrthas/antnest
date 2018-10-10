package com.zrthas.entity.department;

import java.util.Date;

/**
 * @program: antnest
 * @description: 部门修改记录
 * @author: zrthas
 * @create: 2018-10-10
 **/
public class DepartmentModifyEntity {
    public String deptId;
    public String id;
    public Date deptModifyTime;
    public String deptModifyName;
    public String deptModifyRemark;
    public String deptModifyParentId;
    public String deptModifyBy;
    public String deptBeforeName;
    public String deptBeforeParentId;
    public String deptBeforeRemark;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDeptModifyTime() {
        return deptModifyTime;
    }

    public void setDeptModifyTime(Date deptModifyTime) {
        this.deptModifyTime = deptModifyTime;
    }

    public String getDeptModifyName() {
        return deptModifyName;
    }

    public void setDeptModifyName(String deptModifyName) {
        this.deptModifyName = deptModifyName;
    }

    public String getDeptModifyRemark() {
        return deptModifyRemark;
    }

    public void setDeptModifyRemark(String deptModifyRemark) {
        this.deptModifyRemark = deptModifyRemark;
    }

    public String getDeptModifyParentId() {
        return deptModifyParentId;
    }

    public void setDeptModifyParentId(String deptModifyParentId) {
        this.deptModifyParentId = deptModifyParentId;
    }

    public String getDeptModifyBy() {
        return deptModifyBy;
    }

    public void setDeptModifyBy(String deptModifyBy) {
        this.deptModifyBy = deptModifyBy;
    }

    public String getDeptBeforeName() {
        return deptBeforeName;
    }

    public void setDeptBeforeName(String deptBeforeName) {
        this.deptBeforeName = deptBeforeName;
    }

    public String getDeptBeforeParentId() {
        return deptBeforeParentId;
    }

    public void setDeptBeforeParentId(String deptBeforeParentId) {
        this.deptBeforeParentId = deptBeforeParentId;
    }

    public String getDeptBeforeRemark() {
        return deptBeforeRemark;
    }

    public void setDeptBeforeRemark(String deptBeforeRemark) {
        this.deptBeforeRemark = deptBeforeRemark;
    }
}
