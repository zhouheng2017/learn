package com.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-22
 * @Time: 17:19
 */
@FeignClient(value = "service-hello", fallback = SchedulServiceHiImpl.class)
public interface SchedulServiceHi {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam("name") String name);

}
