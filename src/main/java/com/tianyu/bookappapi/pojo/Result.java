package com.tianyu.bookappapi.pojo;

public class Result<T> {
    /** 状态码. */
    private Integer statu;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
