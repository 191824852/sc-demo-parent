package com.zjp.scdemo.portal.preapp;

import com.zjp.scdemo.portal.preapp.rpc.CoreV1ServiceFeign;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
@Log4j2
public class PortalPreAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalPreAppApplication.class, args);
    }


    @Resource
    private CoreV1ServiceFeign coreV1ServiceFeign;


    @GetMapping("rpcCore")
    public String rpcCore(){
        return coreV1ServiceFeign.getServiceName();
    }


    @GetMapping("rpcCoreAndData")
    public String rpcCoreAndData(){
        log.info("coreV1ServiceFeign.rpcData()");
        return coreV1ServiceFeign.rpcData();
    }
}
