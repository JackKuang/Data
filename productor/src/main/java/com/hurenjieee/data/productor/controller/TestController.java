package com.hurenjieee.data.productor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 * @date 2019/3/27 22:50
 */
@RestController
public class TestController {

    @Value("${my.message}")
    private String message;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(){
        return message;
    }
}
