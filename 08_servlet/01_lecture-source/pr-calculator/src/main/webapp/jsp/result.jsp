<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int num1 = (int) request.getAttribute("num1");
        int num2 = (int) request.getAttribute("num2");
        String operator = (String) request.getAttribute("operator");
        int result = (int) request.getAttribute("result");
    %>
    <table border="1" style="text-align: center">
        <th>숫자1</th>
        <th>연산자</th>
        <th>숫자2</th>
        <th>결과값</th>
        <tr>
            <td><%= num1 %></td>
            <td><%= operator %></td>
            <td><%= num2 %></td>
            <td><%= result %></td>
        </tr>
    </table>
</body>
</html>
