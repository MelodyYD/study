
<%@ page contentType="text/html;charset=UTF-8" language="java"
  isErrorPage="true"
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      // 우리가 2번 파일에서 errorPage 로 등록 해뒀다.
      // 하지만 Error 페이지로 사용하기 위해서는
      // isErrorPage="true" 설정을 반드시 해주어야
      // exception 관련 정보를 사용할 수 있게 된다.
      String exceptionType = exception.getClass().getName();
      String exceptionMsg = exception.getMessage();
    %>

    <h1><%=exceptionType%></h1>
    <h3><%=exceptionMsg%></h3>
</body>
</html>
