package com.cloud.feign.controller;

import com.cloud.feign.service.SchedulServiceHi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-22
 * @Time: 17:22
 */
@RestController
@RequestMapping("/")
@Slf4j
public class HiController {


    @Autowired
    private SchedulServiceHi schedulServiceHi;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam("name") String name) {
        log.info("调用了feign：{}", name);
        return schedulServiceHi.sayHiFromClientOne(name);
    }


}
