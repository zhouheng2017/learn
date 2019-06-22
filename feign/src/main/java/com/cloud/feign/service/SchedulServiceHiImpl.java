package com.cloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-22
 * @Time: 19:26
 */
@Component
public class SchedulServiceHiImpl implements SchedulServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
