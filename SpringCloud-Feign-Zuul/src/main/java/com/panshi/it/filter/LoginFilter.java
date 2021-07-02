package com.panshi.it.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //请求路径上必须有token，才可以继续往下执行
        RequestContext requestContext= RequestContext.getCurrentContext();
        HttpServletRequest request= requestContext.getRequest();
        //获取token
        String token=request.getParameter("token");

        //如果token等于空，就不能继续往下执行
        if (token==null||token.trim().equals("")){
            //不然继续转发，往下执行
            requestContext.setSendZuulResponse(false);

            // 返回401状态码。代表未授权
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());

            requestContext.setResponseBody("你好，你没有登录");
            //解决返回中文乱码
            requestContext.getResponse().setCharacterEncoding("UTF-8");
            requestContext.getResponse().setContentType("text/html;cahrset=UTF-8");
        }


        return null;
    }
}
