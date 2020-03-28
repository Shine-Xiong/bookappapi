package com.tianyu.bookappapi.pojo;

import java.io.Serializable;

public class BookHeatRanking implements Serializable {
    //完结榜id
    private Integer hr_id;
    //小说名称
    private String hr_name;
    //小说类型
    private String hr_type;
    private String hr_img;
    //小说热度
    private String hr_heat;
    private Integer hr_bookid;
    private Integer one_id;

    public BookHeatRanking() {
    }

    public Integer getHr_id() {
        return hr_id;
    }

    public void setHr_id(Integer hr_id) {
        this.hr_id = hr_id;
    }

    public String getHr_name() {
        return hr_name;
    }

    public void setHr_name(String hr_name) {
        this.hr_name = hr_name;
    }

    public String getHr_type() {
        return hr_type;
    }

    public void setHr_type(String hr_type) {
        this.hr_type = hr_type;
    }

    public String getHr_img() {
        return hr_img;
    }

    public void setHr_img(String hr_img) {
        this.hr_img = hr_img;
    }

    public String getHr_heat() {
        return hr_heat;
    }

    public void setHr_heat(String hr_heat) {
        this.hr_heat = hr_heat;
    }

    public Integer getHr_bookid() {
        return hr_bookid;
    }

    public void setHr_bookid(Integer hr_bookid) {
        this.hr_bookid = hr_bookid;
    }

    public Integer getOne_id() {
        return one_id;
    }

    public void setOne_id(Integer one_id) {
        this.one_id = one_id;
    }

    @Override
    public String toString() {
        return "BookHeatRanking{" +
                "hr_id=" + hr_id +
                ", hr_name='" + hr_name + '\'' +
                ", hr_type='" + hr_type + '\'' +
                ", hr_img='" + hr_img + '\'' +
                ", hr_heat='" + hr_heat + '\'' +
                ", hr_bookid=" + hr_bookid +
                ", one_id=" + one_id +
                '}';
    }
}
