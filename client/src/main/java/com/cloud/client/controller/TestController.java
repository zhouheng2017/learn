package com.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-22
 * @Time: 15:39
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Value("${zhouheng.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String test(String name) {
        System.out.println("访问了8762。。。。。。");
        return "this.nameHi ---->" + port + name;
    }
}
