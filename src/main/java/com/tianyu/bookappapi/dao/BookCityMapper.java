package com.tianyu.bookappapi.dao;

import com.tianyu.bookappapi.pojo.*;

import java.util.List;

public interface BookCityMapper {

    /**
     * 获取经典推荐所有书籍
     * @return
     */
    List<BookClassic> classicAll(int sex);

    /**
     * 获取大热榜前六的书籍
     * @return
     */
    List<BookHeatRanking> heatrankingTop(int sex);

    /**
     * 获取高分神作所有书籍
     * @return
     */
    List<BookScore> scoreAll(int sex);

    /**
     * 获取新书抢先所有书籍
     * @return
     */
    List<BookNew> newbookAll(int sex);

    /**
     * 获取书城各分类推荐所有书籍
     * @return
     */
    List<BookCity> cityAll(int sex);
}
