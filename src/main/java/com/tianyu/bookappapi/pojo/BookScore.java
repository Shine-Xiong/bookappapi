package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookScore implements Serializable {
    //高分神作id
    private Integer bs_id;
    private String bs_name;
    private String bs_img;
    //评分
    private String bs_score;
    private Integer bs_bookid;
    private Integer one_id;

    public BookScore() {
    }

    public Integer getBs_id() {
        return bs_id;
    }

    public void setBs_id(Integer bs_id) {
        this.bs_id = bs_id;
    }

    public String getBs_name() {
        return bs_name;
    }

    public void setBs_name(String bs_name) {
        this.bs_name = bs_name;
    }

    public String getBs_img() {
        return bs_img;
    }

    public void setBs_img(String bs_img) {
        this.bs_img = bs_img;
    }

    public String getBs_score() {
        return bs_score;
    }

    public void setBs_score(String bs_score) {
        this.bs_score = bs_score;
    }

    public Integer getBs_bookid() {
        return bs_bookid;
    }

    public void setBs_bookid(Integer bs_bookid) {
        this.bs_bookid = bs_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookScore{" +
                "bs_id=" + bs_id +
                ", bs_name='" + bs_name + '\'' +
                ", bs_img='" + bs_img + '\'' +
                ", bs_score='" + bs_score + '\'' +
                ", bs_bookid=" + bs_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
