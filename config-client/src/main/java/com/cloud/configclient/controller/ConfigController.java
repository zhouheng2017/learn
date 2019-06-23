package com.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-23
 * @Time: 13:59
 */

@RequestMapping("/")
@RestController
@RefreshScope
public class ConfigController {

    @Value("${foo}")
    private String value;

    @RequestMapping("/hi")
    public String hello() {
        return value;
    }

}
