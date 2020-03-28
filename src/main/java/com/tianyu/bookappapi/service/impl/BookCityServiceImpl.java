package com.tianyu.bookappapi.service.impl;

import com.tianyu.bookappapi.dao.BookCityMapper;
import com.tianyu.bookappapi.pojo.BookClassic;
import com.tianyu.bookappapi.service.BookCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("BookCityService")
public class BookCityServiceImpl implements BookCityService {

    @Autowired
    private BookCityMapper bookCityMapper;

    @Override
    public Map<String,List> getBoylist(String sex) {
        int sexint="boy".equals(sex)?1:2;
        //初始化返回对象
        Map<String,List<Object>> map=new HashMap<>();
        //查询经典推荐所有书籍
        //List<Map<String, Object>> classiclist = bookCityMapper.classicAll(sexint);
        List<BookClassic> classiclist = bookCityMapper.classicAll(sexint);

        if (classiclist.size()>0&&null!=classiclist){
            map.put(sex+"classiclist",classiclist);
        }
        //查询大热榜前六书籍
        List<Map<String, Object>> heatrankinglist = bookCityMapper.heatrankingTop(sexint);
        if (heatrankinglist.size()>0){
            map.put(sex+"heatrankinglist",heatrankinglist);
        }
        //查询高分神作所有书籍
        List<Map<String, Object>> scorelist=bookCityMapper.scoreAll(sexint);
        if (scorelist.size()>0){
            map.put(sex+"scorelist",scorelist);
        }
        //查询新书抢先所有书籍
        List<Map<String, Object>> newlist=bookCityMapper.newbookAll(sexint);
        if (newlist.size()>0){
            map.put(sex+"newlist",newlist);
        }
        //查询书城各分类推荐书籍
        List<Map<String, Object>> booklist=bookCityMapper.cityAll(sexint);
        if (booklist.size() > 0) {
            map.put(sex+"booklist",booklist);
        }
        /**
        //男生
        if (sexint==1) {

            if (booklist.size() > 0) {
                for (int i = 0; i < booklist.size(); i++) {
                    booklist.get(i).get("two_id");
                }
            }
        }else {
            //女生
            if (booklist.size() > 0) {
                for (int i = 0; i < booklist.size(); i++) {
                    booklist.get(i).get("two_id");
                }
            }
        }
         */
        return map;
    }
}
