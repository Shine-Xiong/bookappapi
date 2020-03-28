package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookNew implements Serializable {
    //新书抢先id
    private Integer bn_id;
    private String bn_name;
    private String bn_img;
    private Integer bn_bookid;
    private Integer one_id;

    public BookNew() {
    }

    public Integer getBn_id() {
        return bn_id;
    }

    public void setBn_id(Integer bn_id) {
        this.bn_id = bn_id;
    }

    public String getBn_name() {
        return bn_name;
    }

    public void setBn_name(String bn_name) {
        this.bn_name = bn_name;
    }

    public String getBn_img() {
        return bn_img;
    }

    public void setBn_img(String bn_img) {
        this.bn_img = bn_img;
    }

    public Integer getBn_bookid() {
        return bn_bookid;
    }

    public void setBn_bookid(Integer bn_bookid) {
        this.bn_bookid = bn_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookNew{" +
                "bn_id=" + bn_id +
                ", bn_name='" + bn_name + '\'' +
                ", bn_img='" + bn_img + '\'' +
                ", bn_bookid=" + bn_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
