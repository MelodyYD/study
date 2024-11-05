<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session</title>
</head>
<body>
    <h1>Session Handling</h1>
    <form action="session" method="post">
        <label>아이디 : </label>
        <input type="text" name="userId"><br>
        <label>비밀번호 : </label>
        <input type="password" name="userPwd" placeholder="비밀번호">
        <br>
        <button type="submit">로그인</button>
    </form>
    <hr>
    <a href="delete">세션 데이터 지워보기</a>
</body>
</html>