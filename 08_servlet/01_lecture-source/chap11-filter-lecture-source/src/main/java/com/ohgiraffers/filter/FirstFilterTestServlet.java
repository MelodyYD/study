package com.ohgiraffers.filter;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/first/filter")
public class FirstFilterTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet 메소드 호출 확인됨...");

        PrintWriter out = resp.getWriter();
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head></head>");
        out.println("<body>");
        out.println("<h3>필터 확인 용 서블릿 요청 확인</h3>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();

    }
}