package com.hurenjieee.data.consumer.controller;

import com.hurenjieee.data.consumer.service.ProductorHystrixRibbonService;
import com.hurenjieee.data.consumer.service.ProductorHystrixService;
import com.hurenjieee.data.consumer.service.ProductorService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 * @date 2019/3/28 20:15
 */
@RestController
@RequestMapping("/consumer")
public class TestController {

    @Autowired
    ProductorHystrixService productorHystrixService;

    @Autowired
    ProductorHystrixRibbonService productorHystrixRibbonService;

    @RequestMapping("/test1")
    @ResponseBody
    public String test(){
        return productorHystrixService.test();
    }


    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        return productorHystrixRibbonService.test();
    }

}
