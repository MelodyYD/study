<!--
    페이지 지시자 태그(추가적으로 지시자 태그는 include, taglib 등이 있다.)
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP 기본 문법</h1>
    <!-- HTML 주석입니다 -->
    <%-- JSP 주석입니다 --%>

    <!-- 선언태그 -->
    <%!
        private String name;
        private int age;
    %>

    <!-- 스크립트릿 태그 -->
    <%
        name = "조평훈";
        age = 20;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    %>
    <!-- 표현 태그 -->
    <h3>이름 : <%= name %></h3>
    <h3>나이 : <%= age %></h3>

</body>
</html>
