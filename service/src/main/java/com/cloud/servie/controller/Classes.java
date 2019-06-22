package com.cloud.servie.controller;

import cn.hutool.system.HostInfo;
import cn.hutool.system.SystemUtil;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-06-22
 * @Time: 11:07
 */
public class Classes {
    public void test(){
        HostInfo hostInfo = SystemUtil.getHostInfo();
        System.out.println(hostInfo);
    }

    public static void main(String[] args) {
        HostInfo hostInfo = SystemUtil.getHostInfo();
        System.out.println(hostInfo);
    }
}
