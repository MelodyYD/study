package com.ohgiraffers.jsp.controller;

import com.ohgiraffers.jsp.service.MenuPriceCalculator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 사용자의 요청에 대한 처리
        String menuName = req.getParameter("menuName");
        int amount = Integer.parseInt(req.getParameter("amount"));

        // 비즈니스 로직 간단히 수행
        int totalPrice = new MenuPriceCalculator().calcTotalPrice(menuName, amount);

        // 다른 서블릿에서 사용할 값 setting
        req.setAttribute("menuName", menuName);
        req.setAttribute("amount", amount);
        req.setAttribute("totalPrice", totalPrice);

        RequestDispatcher rd = req.getRequestDispatcher("/jsp/5_response.jsp");
        rd.forward(req, resp);


    }
}
