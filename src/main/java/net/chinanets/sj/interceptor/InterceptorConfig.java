package net.chinanets.sj.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@SuppressWarnings("unused")
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //对来自/account/1和account/list 这个链接来的请求进行拦截，链式结构
        registry.addInterceptor(new AccountInterceptor()).addPathPatterns("/common/1").addPathPatterns("/common/2");
    }
}