package com.zrthas.entity.dictionary;

/**
 * @program: antnest
 * @description: 字典表
 * @author: zrthas
 * @create: 2018-10-10
 **/
public class DictionaryEntity {
    public String dictId;
    public String dictName;
    public String dictValue;
    public String dictRemark;
    public String dictStatus;

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictRemark() {
        return dictRemark;
    }

    public void setDictRemark(String dictRemark) {
        this.dictRemark = dictRemark;
    }

    public String getDictStatus() {
        return dictStatus;
    }

    public void setDictStatus(String dictStatus) {
        this.dictStatus = dictStatus;
    }
}
