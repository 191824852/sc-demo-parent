package com.zjp.scdemo.zull.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 创建时间 2019年九月25日 星期三 9:31
 * 作者: zhangjunping
 */
@Slf4j
@Component
public class BaseFilter  extends ZuulFilter {

    public String filterType() {
        return "pre";
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return true;
    }

    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String requestURI = request.getRequestURI();
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("requestURI:{}",requestURI);
        log.info("parameterMap:{}",parameterMap);
        return null;
    }
}
