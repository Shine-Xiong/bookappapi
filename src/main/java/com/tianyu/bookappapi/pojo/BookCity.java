package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookCity implements Serializable {
    //书城各分类推荐id
    private Integer bc_id;
    //小说名称
    private String bc_name;
    //小说图片
    private String bc_img;
    //小说介绍
    private String bc_introduce;
    //小说评分
    private String bc_score;
    //小说一级分类
    private Integer one_id;
    //小说二级分类
    private Integer two_id;

    public BookCity() {
    }

    public Integer getBc_id() {
        return bc_id;
    }

    public void setBc_id(Integer bc_id) {
        this.bc_id = bc_id;
    }

    public String getBc_name() {
        return bc_name;
    }

    public void setBc_name(String bc_name) {
        this.bc_name = bc_name;
    }

    public String getBc_img() {
        return bc_img;
    }

    public void setBc_img(String bc_img) {
        this.bc_img = bc_img;
    }

    public String getBc_introduce() {
        return bc_introduce;
    }

    public void setBc_introduce(String bc_introduce) {
        this.bc_introduce = bc_introduce;
    }

    public String getBc_score() {
        return bc_score;
    }

    public void setBc_score(String bc_score) {
        this.bc_score = bc_score;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    public Integer getTwo_id() {
        return two_id;
    }

    public void setTwo_id(Integer two_id) {
        this.two_id = two_id;
    }

    @Override
    public String toString() {
        return "BookCity{" +
                "bc_id=" + bc_id +
                ", bc_name='" + bc_name + '\'' +
                ", bc_img='" + bc_img + '\'' +
                ", bc_introduce='" + bc_introduce + '\'' +
                ", bc_score='" + bc_score + '\'' +
                ", one_id=" + one_id +
                ", two_id=" + two_id +
                '}';
    }
}
