package com.cloud.ribbon.controller;

import com.cloud.feign.service.SchedulServiceHi;
import com.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-22
 * @Time: 16:40
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private SchedulServiceHi schedulServiceHi;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.hiService(name);
    }

    @RequestMapping("/hi")
    public String hi(String name) {

        String s = schedulServiceHi.sayHiFromClientOne(name);
        System.out.println(s);
        return s;
    }
}
