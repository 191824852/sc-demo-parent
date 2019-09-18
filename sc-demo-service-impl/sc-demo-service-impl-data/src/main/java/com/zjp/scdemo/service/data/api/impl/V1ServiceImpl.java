package com.zjp.scdemo.service.data.api.impl;

import com.zjp.scdemo.data.service.api.V1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建时间 2019年九月17日 星期二 18:00
 * 作者: zhangjunping
 */
@RestController
@RequestMapping("/v1")
public class V1ServiceImpl implements V1Service {

    public String getServiceName() {
        return "i am data service";
    }
}
