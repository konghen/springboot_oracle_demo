package net.chinanets.sj.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AccountInterceptor.class);

    ThreadLocal<Long> time = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /**
         * 对来自后台的请求统一进行日志处理
         */
        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        System.out.println(request.getParameterMap());
        logger.info(String.format("请求参数, url: %s, method: %s, uri: %s, params: %s", url, method, uri, queryString));

        time.set(System.currentTimeMillis());

        System.out.print("开始进入springmvc，线程id为" + Thread.currentThread().getId() + "，时间为" + time.get());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.print("开始离开springmvc，线程id为" + Thread.currentThread().getId() + "，总耗时时间为" + (System.currentTimeMillis() - time.get()));
    }
}