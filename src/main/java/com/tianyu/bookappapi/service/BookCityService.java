package com.tianyu.bookappapi.service;

import java.util.List;
import java.util.Map;

public interface BookCityService {

    /**
     * 获取书城男生界面所有书籍
     * @return
     */
    Map<String,List> getBoylist(String sex);

}
