package com.zjp.scdemo.service.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 创建时间 2019年九月12日 星期四 9:48
 * 作者: zhangjunping
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class DataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class,args);
    }
}
