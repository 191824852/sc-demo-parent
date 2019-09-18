package com.zjp.scdemo.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
//@EnableDiscoveryClient
public class ScDemoZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScDemoZuulApplication.class, args);
    }

}
