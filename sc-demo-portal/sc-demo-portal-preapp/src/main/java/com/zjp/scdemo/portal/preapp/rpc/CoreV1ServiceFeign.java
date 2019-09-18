package com.zjp.scdemo.portal.preapp.rpc;

import com.zjp.scdemo.core.service.api.V1Service;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 创建时间 2019年九月17日 星期二 17:41
 * 作者: zhangjunping
 */
@FeignClient(name = "core",url = "localhost:63002/core/v1")
public interface CoreV1ServiceFeign extends V1Service {}
