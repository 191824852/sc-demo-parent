package com.zjp.scdemo.service.core.rpc;

import com.zjp.scdemo.data.service.api.V1Service;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 创建时间 2019年九月17日 星期二 18:26
 * 作者: zhangjunping
 */
@FeignClient(name = "data",url = "localhost:63003/data/v1")
public interface DataV1ServiceFeign extends V1Service {
}
