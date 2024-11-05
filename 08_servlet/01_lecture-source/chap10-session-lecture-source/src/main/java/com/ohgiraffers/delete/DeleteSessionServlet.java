package com.ohgiraffers.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* comment.
        *   session 패키지에서 했던 id 값이 그대로 들어있는 것을
        *   확인 할 수 있다.
        *   따라서 session 이라는 것은 server 가 run 을 하게 되면
        *   별도의 공간을 할당 받아 언제든 server 가 종료되지 않는다면
        *   값을 꺼내서 사용할 수 있다.
        *  */
        HttpSession session = req.getSession();
        
        String id = (String) session.getAttribute("id");

        System.out.println("id = " + id);

        /* comment.
        *   Session 에 들어있는 데이터 지우기
        *   1. 설정 시간이 지나면 만료된다.
        *   2. removeAttribute(key) 로 session 의 값 지우기
        *   3. invalidate() 를 호출하면 session 의 모든 데이터 제거
        *  */
        session.removeAttribute("id");

        String userId = (String) session.getAttribute("id");

        System.out.println("userId = " + userId);

        /* comment.
        *   invalidate 를 호출하면 세션 자체를 무효화 한다.
        *  */

        session.invalidate();
        /* comment.
        *   Error 가 뜨는 이유는 이미 위에서 Session 자체를 무효화(만료)
        *   시켰기 때문에 이후에 세션을 참조하려고 하면 에러가 발생한다.
        *  */
        String password = (String) session.getAttribute("pwd");

    }
}
