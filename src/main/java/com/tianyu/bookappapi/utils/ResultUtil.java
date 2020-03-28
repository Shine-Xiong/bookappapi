package com.tianyu.bookappapi.utils;

import com.tianyu.bookappapi.pojo.Result;

public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setStatu(200);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer statu, String msg) {
        Result result = new Result();
        result.setStatu(statu);
        result.setMsg(msg);
        return result;
    }
}
