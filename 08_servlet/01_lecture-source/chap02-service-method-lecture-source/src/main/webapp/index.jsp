<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 align="center">Service() 메소드의 역할</h1>
    <h3>GET 방식의 요청</h3>
    <h4>a 태그의 href  속성을 통한 GET 요청</h4>
    <a href="request-service">서비스 메소드 요청하기</a>
    <h4>form 태그의 method 속성을 GET 으로 설정</h4>
    <form action="request-service" method="get">
        <input type = "submit" value="GET 방식 요청 전송">
    </form>
    <h4>form 태그의 method 속성을 POST 로 설정</h4>
    <form action="request-service" method="post">
        <input type="submit" value="POST 방식 요청 전송">
    </form>
</body>
</html>