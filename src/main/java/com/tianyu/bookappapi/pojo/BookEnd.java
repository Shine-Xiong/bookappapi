package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookEnd implements Serializable {
    //完结榜id
    private Integer end_id;
    //小说名称
    private String end_name;
    //小说类型
    private String end_type;
    private String end_img;
    //小说热度
    private String end_heat;
    private Integer end_bookid;
    private Integer one_id;

    public BookEnd() {
    }

    public Integer getEnd_id() {
        return end_id;
    }

    public void setEnd_id(Integer end_id) {
        this.end_id = end_id;
    }

    public String getEnd_name() {
        return end_name;
    }

    public void setEnd_name(String end_name) {
        this.end_name = end_name;
    }

    public String getEnd_type() {
        return end_type;
    }

    public void setEnd_type(String end_type) {
        this.end_type = end_type;
    }

    public String getEnd_img() {
        return end_img;
    }

    public void setEnd_img(String end_img) {
        this.end_img = end_img;
    }

    public String getEnd_heat() {
        return end_heat;
    }

    public void setEnd_heat(String end_heat) {
        this.end_heat = end_heat;
    }

    public Integer getEnd_bookid() {
        return end_bookid;
    }

    public void setEnd_bookid(Integer end_bookid) {
        this.end_bookid = end_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookEnd{" +
                "end_id=" + end_id +
                ", end_name='" + end_name + '\'' +
                ", end_type='" + end_type + '\'' +
                ", end_img='" + end_img + '\'' +
                ", end_heat='" + end_heat + '\'' +
                ", end_bookid=" + end_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
