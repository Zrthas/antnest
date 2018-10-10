package com.zrthas.entity.department;

import java.util.Date;

/**
 * @program: antnest
 * @description: 部门信息
 * @author: zrthas
 * @create: 2018-10-10
 **/
public class DepartmentEntity {
    public String deptId;
    public String deptName;
    public String deptParentId;
    public Date deptEstablished;
    public String deptStatus;
    public String deptCreateBy;
    public Date deptCreateTime;
    public String deptRemark;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptParentId() {
        return deptParentId;
    }

    public void setDeptParentId(String deptParentId) {
        this.deptParentId = deptParentId;
    }

    public Date getDeptEstablished() {
        return deptEstablished;
    }

    public void setDeptEstablished(Date deptEstablished) {
        this.deptEstablished = deptEstablished;
    }

    public String getDeptStatus() {
        return deptStatus;
    }

    public void setDeptStatus(String deptStatus) {
        this.deptStatus = deptStatus;
    }

    public String getDeptCreateBy() {
        return deptCreateBy;
    }

    public void setDeptCreateBy(String deptCreateBy) {
        this.deptCreateBy = deptCreateBy;
    }

    public Date getDeptCreateTime() {
        return deptCreateTime;
    }

    public void setDeptCreateTime(Date deptCreateTime) {
        this.deptCreateTime = deptCreateTime;
    }

    public String getDeptRemark() {
        return deptRemark;
    }

    public void setDeptRemark(String deptRemark) {
        this.deptRemark = deptRemark;
    }
}
