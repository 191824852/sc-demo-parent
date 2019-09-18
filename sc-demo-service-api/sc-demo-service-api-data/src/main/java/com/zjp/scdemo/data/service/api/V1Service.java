package com.zjp.scdemo.data.service.api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * 创建时间 2019年九月17日 星期二 17:48
 * 作者: zhangjunping
 */

public interface V1Service {

    @GetMapping("getServiceName")
    String getServiceName();
}
