package com.hurenjieee.data.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @author Jack
 * @date 2019/3/28 20:07
 */
@Service
public class ProductorHystrixRibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackTest")
    public String test(){
        String result = "";
        try {
            result = restTemplate.postForObject("http://productor/test",new HashMap<>(),String.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public String fallbackTest(){
        return "fallbackTest";
    }
}
