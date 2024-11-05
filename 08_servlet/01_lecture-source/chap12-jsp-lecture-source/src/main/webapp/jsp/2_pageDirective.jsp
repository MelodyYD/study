<%@ page import="java.time.LocalDateTime" errorPage="errorPage.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Page 지시자 태그</h1>
    <%
        LocalDateTime date = LocalDateTime.now();
        System.out.println("date = " + date);

        // 고의로 NullPointerException 발생시키기
        String str = null;
        char ch = str.charAt(0);

    %>
</body>
</html>
