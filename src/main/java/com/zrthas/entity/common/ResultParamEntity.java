package com.zrthas.entity.common;

import java.util.List;

/**
 * @author:
 * @desc:
 * @date:yyyy/mm/dd
 */
public class ResultParamEntity<T> {
    private Integer code;
    private String msg;
    private List<T> data;
    private Integer count;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
