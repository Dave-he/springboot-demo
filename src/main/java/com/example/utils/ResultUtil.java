package com.example.utils;

import com.example.entity.Result;

/**
 * Created by liyubo on 2017/4/1.
 */
public class ResultUtil {

    /**
     * 带参数成功响应
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 不带参数成功响应
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 请求失败响应
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
