package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookHotSearch implements Serializable {
    //热搜榜id
    private Integer hs_id;
    private String hs_name;
    //小说类型
    private String hs_type;
    private String hs_img;
    //搜索量
    private String hs_search;
    private Integer hs_bookid;
    private Integer one_id;

    public BookHotSearch() {
    }

    public Integer getHs_id() {
        return hs_id;
    }

    public void setHs_id(Integer hs_id) {
        this.hs_id = hs_id;
    }

    public String getHs_name() {
        return hs_name;
    }

    public void setHs_name(String hs_name) {
        this.hs_name = hs_name;
    }

    public String getHs_type() {
        return hs_type;
    }

    public void setHs_type(String hs_type) {
        this.hs_type = hs_type;
    }

    public String getHs_img() {
        return hs_img;
    }

    public void setHs_img(String hs_img) {
        this.hs_img = hs_img;
    }

    public String getHs_search() {
        return hs_search;
    }

    public void setHs_search(String hs_search) {
        this.hs_search = hs_search;
    }

    public Integer getHs_bookid() {
        return hs_bookid;
    }

    public void setHs_bookid(Integer hs_bookid) {
        this.hs_bookid = hs_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookHotSearch{" +
                "hs_id=" + hs_id +
                ", hs_name='" + hs_name + '\'' +
                ", hs_type='" + hs_type + '\'' +
                ", hs_img='" + hs_img + '\'' +
                ", hs_search='" + hs_search + '\'' +
                ", hs_bookid=" + hs_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
