package com.cimc.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chenz
 */
@Component
public class TokenFilter extends ZuulFilter {

    /**
     * 设置过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的执行顺序，当请求在一个阶段的时候存在多个多个过滤器时，需要根据该方法的返回值依次执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器类型 pre 表示在 请求之前进行拦截
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 业务逻辑
     * @return
     */
    @Override
    public Object run() {
        // 获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String userToken = request.getParameter("token");
        if (StringUtils.isEmpty(userToken)) {
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("token is null");
            return null;
        }
        // 否则正常执行业务逻辑.....
        return null;
    }

}
