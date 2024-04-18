package com.example.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ZuulLoggingFilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {

        log.info("******************** printing logs : ");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("******************** printing logs : " +request.getRequestURI());

        return null;
    }
    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    // filter를 사용할지 말
    @Override
    public boolean shouldFilter() {
        return true;
    }

}
