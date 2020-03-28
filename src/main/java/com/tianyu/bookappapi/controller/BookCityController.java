package com.tianyu.bookappapi.controller;

import com.tianyu.bookappapi.dao.BookCityMapper;
import com.tianyu.bookappapi.pojo.BookClassic;
import com.tianyu.bookappapi.service.BookCityService;
import com.tianyu.bookappapi.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BookCityController {

    @Autowired
    private BookCityService bookCityService;

    @CrossOrigin(value = "http://localhost:8081")
    @GetMapping(value = "/bookboy")
    public Object bookboylist(@RequestParam(value = "key") String key,@RequestParam(value = "sex") String sex){
        Map<String,List<Map<String,Object>>> maps=bookCityService.getBoylist(sex);
            if (maps.size()>0&&null!=maps) {
                System.out.println(maps.get("boyclassiclist").get(0).toString());
                return ResultUtil.success(maps);
            }
            return ResultUtil.error(500,"暂无数据");
        //}
        //return ResultUtil.error(401,"请求密匙验证失败");
    }

}
