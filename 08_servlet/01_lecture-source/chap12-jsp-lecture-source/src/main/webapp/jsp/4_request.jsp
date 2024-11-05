<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>메뉴판</h1>
    <form action="/menu/order" method="post">
      <select name="menuName" id="menu">
        <option value="햄버거">햄버거</option>
        <option value="짜짱면">짜장면</option>
        <option value="불고기백반">불고기백반</option>
        <option value="순대국">순대국</option>
      </select>
      <input type="number" min="0" max="50" step="1" name="amount">
      <button type="submit">주문하기</button>
    </form>
</body>
</html>
