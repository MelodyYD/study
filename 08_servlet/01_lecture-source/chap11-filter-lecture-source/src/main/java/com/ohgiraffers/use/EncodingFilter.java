package com.ohgiraffers.use;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/* comment. xml 방식으로 필터 생성 */
public class EncodingFilter implements Filter {

    private String encodingType;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        /* comment.
        *   xml 설정한 init-param 의 key 를 이용하여
        *   config 객체에서 꺼낼 수 있다.
        *  */

        encodingType = filterConfig.getInitParameter("encoding-type");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) servletResponse;

        response.setContentType(encodingType);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
