<%--
  Created by IntelliJ IDEA.
  User: yuntaehun
  Date: 2/22/24
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h3>로그인창</h3>
  <form action="loginForm" method="post">
  아이디:<input type="text" name="id">
  비밀번호:<input type="password" name="pw">
  <input type="submit" value="로그인">
  </form>

  ${msg}

</body>
</html>
