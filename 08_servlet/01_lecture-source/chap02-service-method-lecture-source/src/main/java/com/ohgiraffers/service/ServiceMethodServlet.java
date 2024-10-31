package com.ohgiraffers.service;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/request-service")
public class ServiceMethodServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String httpMethod = request.getMethod();

        System.out.println("httpMethod = " + httpMethod);

        if(("GET").equals(httpMethod)) {
            // httpMethod 방식이 GET
            doGet(request, response);
        } else if(("POST").equals(httpMethod)) {
            doPost(request, response);
        }

        /*
        *   http 메소드는 get, post, head, options, put delete 등등이 있지만,
        *   가장 많이 사용되는 것은 get 과 post 이다.
        * */

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출됨...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출됨...");
    }
}