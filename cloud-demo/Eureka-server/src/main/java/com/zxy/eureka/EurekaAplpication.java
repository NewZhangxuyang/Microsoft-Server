package com.zxy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : zhangxuyang
 * @date :  2022/8/12
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaAplpication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAplpication.class,args);
    }
}
