package com.example.exception;

import com.example.enums.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * RuntimeException 回滚事务
 * Created by liyubo on 2017/4/1.
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException (ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
