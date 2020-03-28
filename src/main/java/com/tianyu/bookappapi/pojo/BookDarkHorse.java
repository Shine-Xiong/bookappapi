package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookDarkHorse implements Serializable {
    //黑马榜id
    private Integer dh_id;
    //小说名称
    private String dh_name;
    //小说类型
    private String dh_type;
    //小说图片
    private String dh_img;
    //小说近增加热度
    private String dh_heat;
    //对应小说id
    private Integer dh_bookid;
    //对应小说一级分类(区别男生还是女生)
    private Integer one_id;

    public BookDarkHorse() {
    }

    public Integer getDh_id() {
        return dh_id;
    }

    public void setDh_id(Integer dh_id) {
        this.dh_id = dh_id;
    }

    public String getDh_name() {
        return dh_name;
    }

    public void setDh_name(String dh_name) {
        this.dh_name = dh_name;
    }

    public String getDh_type() {
        return dh_type;
    }

    public void setDh_type(String dh_type) {
        this.dh_type = dh_type;
    }

    public String getDh_img() {
        return dh_img;
    }

    public void setDh_img(String dh_img) {
        this.dh_img = dh_img;
    }

    public String getDh_heat() {
        return dh_heat;
    }

    public void setDh_heat(String dh_heat) {
        this.dh_heat = dh_heat;
    }

    public Integer getDh_bookid() {
        return dh_bookid;
    }

    public void setDh_bookid(Integer dh_bookid) {
        this.dh_bookid = dh_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookDarkHorse{" +
                "dh_id=" + dh_id +
                ", dh_name='" + dh_name + '\'' +
                ", dh_type='" + dh_type + '\'' +
                ", dh_img='" + dh_img + '\'' +
                ", dh_heat='" + dh_heat + '\'' +
                ", dh_bookid=" + dh_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
