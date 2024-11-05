package com.ohgiraffers.calculator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operator = req.getParameter("operator");

        int result = new Result().CalcResult(num1, num2, operator);

        req.setAttribute("num1", num1);
        req.setAttribute("num2", num2);
        req.setAttribute("operator", operator);
        req.setAttribute("result", result);

        RequestDispatcher rd = req.getRequestDispatcher("jsp/result.jsp");
        rd.forward(req, resp);

    }
}
