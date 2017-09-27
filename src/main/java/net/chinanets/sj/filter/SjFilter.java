package net.chinanets.sj.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 注册多个过滤器，过滤路径是/*，不能是/**
 * setOrder是为过滤器排序，数字越小，排名越靠前，越先执行
 * Created by Administrator on 2017/5/18.
 */
@Configuration
public class SjFilter {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        Account2Filter accountFilter = new Account2Filter();
        registrationBean.setFilter(accountFilter);
        registrationBean.setOrder(1);

        List<String> urlPatterns = new ArrayList<>();
        //对请求地址包含account的路径进行过滤
        urlPatterns.add("/common/*");
        registrationBean.setUrlPatterns(urlPatterns);

        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filter1RegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        Account1Filter accountFilter = new Account1Filter();
        registrationBean.setFilter(accountFilter);
        registrationBean.setOrder(2);

        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/common/*");
        registrationBean.setUrlPatterns(urlPatterns);

        return registrationBean;
    }
}
