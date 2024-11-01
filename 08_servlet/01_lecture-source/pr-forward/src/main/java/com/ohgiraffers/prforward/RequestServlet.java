package com.ohgiraffers.prforward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class RequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("POST 수행");
        String id = req.getParameter("userId");
        String pwd = req.getParameter("userPwd");

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);

        req.setAttribute("id", id);

        RequestDispatcher rd = req.getRequestDispatcher("response");
        rd.forward(req, resp);

    }

}
