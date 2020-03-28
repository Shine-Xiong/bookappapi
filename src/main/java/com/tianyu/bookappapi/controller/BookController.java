package com.tianyu.bookappapi.controller;

import com.tianyu.bookappapi.utils.RequestKeyUtil;
import com.tianyu.bookappapi.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

//    @Autowired
//    private BookCityService bookCityService;
//
//    @GetMapping(value = "/book/list")
//    public Object booklist(@RequestParam String key){
//        if (RequestKeyUtil.GetKey(key)){
//            if (bookCityService.getBooks().size()>0) {
//                return ResultUtil.success(bookCityService.getBooks());
//            }
//            return ResultUtil.error(500,"暂无数据");
//        }
//        return ResultUtil.error(401,"请求密匙验证失败");
//    }

}
