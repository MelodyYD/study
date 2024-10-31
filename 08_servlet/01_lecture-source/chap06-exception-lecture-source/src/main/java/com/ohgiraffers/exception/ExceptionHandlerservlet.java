package com.ohgiraffers.exception;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/showErrorPage")
public class ExceptionHandlerservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String statusCode = req.getAttribute("jakarta.servlet.error.status_code").toString();
        String message = req.getAttribute("jakarta.servlet.error.message").toString();

        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1>")
                .append(statusCode)
                .append(" - ")
                .append(message)
                .append("</h1>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.print(errorPage.toString());

        out.flush();
        out.close();

    }

}