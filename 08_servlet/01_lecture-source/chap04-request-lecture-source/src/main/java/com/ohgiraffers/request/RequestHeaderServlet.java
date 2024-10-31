package com.ohgiraffers.request;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/headers")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration<String> headerName = req.getHeaderNames();
        while (headerName.hasMoreElements()) {
            System.out.println(headerName.nextElement());
        }

    }

}