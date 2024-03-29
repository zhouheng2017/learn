package com.cloud.servie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhouheng
 */
@EnableConfigurationProperties({ZhouhengProperties.class})
@SpringBootApplication
@EnableEurekaServer
public class ServieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServieApplication.class, args);
    }

}
