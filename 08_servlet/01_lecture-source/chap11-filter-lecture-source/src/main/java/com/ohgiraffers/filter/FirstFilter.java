package com.ohgiraffers.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {
        System.out.println("필터 기본 생성자 호출됨...");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 인스턴스 최초 생성 시 호출됨...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /* comment.
        *   doFilter 메소드는 request 가 전달 되기 전에
        *   가로채어 무엇인 가 할 일을 작성한다.
        *  */

        System.out.println("doFilter() 호출됨...");

        // 필터에서 실행 할 코드 작성 영역

        // 실행 코드 실행 후 다음 필터 혹은 서블릿으로 doGet/doPost 호출
        filterChain.doFilter(servletRequest, servletResponse);

        // 서블릿에서 처리 후 다시 수행 할 내용 있으면 작성하는 영역
        System.out.println("Servlet 할 일 끝~");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter 인스턴스 소멸됨..");
    }
}
