package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookClassic implements Serializable {

    //经典推荐id
    private Integer bc_id;
    //小说名称
    private String bc_name;
    //小说图片
    private String bc_img;
    //对应小说id
    private Integer bc_bookid;
    //小说一级分类
    private Integer one_id;

    public BookClassic() {
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

    public Integer getBc_bookid() {
        return bc_bookid;
    }

    public void setBc_bookid(Integer bc_bookid) {
        this.bc_bookid = bc_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookClassic{" +
                "bc_id=" + bc_id +
                ", bc_name='" + bc_name + '\'' +
                ", bc_img='" + bc_img + '\'' +
                ", bc_bookid=" + bc_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
