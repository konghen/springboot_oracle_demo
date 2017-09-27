package net.chinanets.sj.filter;

import javax.servlet.*;
import java.io.IOException;

public class Account1Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("开始过滤1");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }

}
