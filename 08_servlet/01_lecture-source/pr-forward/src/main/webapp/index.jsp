<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Forward 연습</h1>
    <form action="forward" method="post">
        <label>아이디 : </label>
        <input type="text" name="userId">
        <br>
        <label>패스워드 : </label>
        <input type="password" name="userPwd">
        <br>
        <button type="submit">login</button>
    </form>
</body>
</html>