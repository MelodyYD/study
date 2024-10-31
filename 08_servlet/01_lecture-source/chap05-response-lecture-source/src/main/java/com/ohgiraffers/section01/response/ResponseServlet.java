package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        *   서블릿이 수행하는 역할은 크게 3가지가 있다.
        *   1. 사용자의 요청(request) 받기
        *       - HttpMethod 종류에 따라 parameter 로 넘어온 데이터 꺼내기
        *   2. 입력 받은 값을 토대로 비즈니스 로직 구현
        *       - EX) DB 접속 관련, CRUD 관련 로직
        *   3. 사용장에게 답(response) 하기
        *       - 문자열로 동적인 웹 페이지를 만들고 스트림을 이용해 내보낸다.
        * */

        String hi = "응답 결과입니다~~~~~~~";

        StringBuilder builder = new StringBuilder();
        builder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1>" + hi + "</h1>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.write(builder.toString());

        out.flush();
        out.close();

    }
}
