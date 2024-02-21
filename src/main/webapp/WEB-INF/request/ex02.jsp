<%--
  Created by IntelliJ IDEA.
  User: yuntaehun
  Date: 2/21/24
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>ex02화면</h3>
    <form action="param" method="post">
        아이디:<input type="text" name="id">
        이름:<input type="text" name="name">
        나이:<input type="text" name="age">
        관심분야:
        <input type="checkbox" name="inter">자바
        <input type="checkbox" name="inter">스프링
        <input type="checkbox" name="inter">데이터베이스

        <input type="submit" value="확인">
    </form>
</body>
</html>
