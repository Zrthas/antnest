package com.zrthas.entity.dictionary;

/**
 * @program: antnest
 * @description: 字典组
 * @author: zrthas
 * @create: 2018-10-10
 **/
public class DictionaryGroupEntity {
    public String dictGroupId;
    public String dictGroupName;
    public String dictGroupStatus;
    public String dictGroupRemark;

    public String getDictGroupId() {
        return dictGroupId;
    }

    public void setDictGroupId(String dictGroupId) {
        this.dictGroupId = dictGroupId;
    }

    public String getDictGroupName() {
        return dictGroupName;
    }

    public void setDictGroupName(String dictGroupName) {
        this.dictGroupName = dictGroupName;
    }

    public String getDictGroupStatus() {
        return dictGroupStatus;
    }

    public void setDictGroupStatus(String dictGroupStatus) {
        this.dictGroupStatus = dictGroupStatus;
    }

    public String getDictGroupRemark() {
        return dictGroupRemark;
    }

    public void setDictGroupRemark(String dictGroupRemark) {
        this.dictGroupRemark = dictGroupRemark;
    }
}
