package com.hurenjieee.data.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jack
 * @date 2019/3/28 20:07
 */
@Service
public class ProductorHystrixService {

    @Autowired
    ProductorService productorService;

    @HystrixCommand(fallbackMethod = "fallbackTest")
    public String test(){
        return productorService.test();
    }

    public String fallbackTest(){
        return "fallbackTest";
    }
}
