package com.ohgiraffers.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionHandlingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String id = req.getParameter("userId");
        String pwd = req.getParameter("userPwd");

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        /* comment.
        *   redirect 했을 때 id, pwd 가 null 이 나오는 이유는
        *   저번에 했던 것처럼 request 객체가 전혀 다른 객체 이기
        *   때문이다.
        *  */
//        resp.sendRedirect("redirect");

        /* comment.
        *   저번 챕터에서는 Cookie 라는 기술을 사용해서
        *   redirect 시 값을 저장하여 사용했다.
        *   하지만 쿠키는 보안상의 단점과 지원하지 않는 브라우저 등의
        *   문제로 인해 적합하지 않는 경우가 다수 있다.
        *   특히 회원 정보를 이용해서 해당 회원의 로그인 상태를 계속
        *   유지해야 하는 경우가 특히 그렇다.
        *   서버쪽에서 관리하는 Session 인스턴스를 사용하여 상태를
        *   유지하는 방법을 알아 볼 것이다.
        *  */

        HttpSession session = req.getSession();

        // 세션을 만료시킬 수 있는 유효시간 기본 설정 시간 : 30분
        System.out.println("default 유지 시간 : " + session.getMaxInactiveInterval());

        session.setMaxInactiveInterval(60 * 10);    // 10분

        System.out.println("변경 후 유지 시간 : " + session.getMaxInactiveInterval());

        /* comment.
            session 은 브라우저 당 한 개씩 고유한 아이디를 가지고 하나의 인스턴스 이용
        */

        System.out.println("session 의 id : " + session.getId());
        /* comment.
        *   우리가 공유 할 값을 담을 때는 setAttribute(String key, Object value)
        *   형태로 담게 된다.
        *   값을 꺼낼 때는 getAttribute(key) 로 꺼낼 수 있다.
        *  */
        session.setAttribute("id", id);
        session.setAttribute("pwd", pwd);

        resp.sendRedirect("redirect");
    }
}
