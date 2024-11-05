<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h3>계산기</h3>
    <form action="calculator" method="post">
        <input type="number" name="num1" style="width: 50px">
        <select name="operator" id="operator" style="width: 40px">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
            <option value="%">%</option>
        </select>
        <input type="number" name="num2" style="width: 50px">
        <button type="submit" value="계산" name="submit">계산</button>
        <button type="reset" value="재입력" name="reset">재입력</button>
    </form>

</body>
</html>