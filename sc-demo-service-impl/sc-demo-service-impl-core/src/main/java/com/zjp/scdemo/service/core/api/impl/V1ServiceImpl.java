package com.zjp.scdemo.service.core.api.impl;

import com.zjp.scdemo.core.service.api.V1Service;
import com.zjp.scdemo.service.core.rpc.DataV1ServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 创建时间 2019年九月17日 星期二 17:57
 * 作者: zhangjunping
 */
@RestController
@RequestMapping("/v1")
public class V1ServiceImpl implements V1Service {

    @Resource
    private DataV1ServiceFeign dataV1ServiceFeign;

    public String getServiceName() {
        return "i am core service";
    }


    public String rpcData() {
        return "core 服务调用 data 服务,data响应：" + dataV1ServiceFeign.getServiceName();
    }
}
