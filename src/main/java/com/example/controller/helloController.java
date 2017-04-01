package com.example.controller;

import com.example.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liyubo on 2017/3/31.
 */
@RestController
public class helloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize()+"-"+girlProperties.getAge();
    }

    /**
     *  获取路径中的值
     * @param id
     * @return
     */
    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
    public String good(@PathVariable("id") Integer id){
        return "id:"+id;
    }

    /**
     * 获取路径携带的参数
     * @param id
     * @return
     */
    @GetMapping(value = "/say")
    public String param(@RequestParam("id") Integer id){
        return "id="+id;
    }



}
