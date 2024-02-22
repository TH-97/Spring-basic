<%--
  Created by IntelliJ IDEA.
  User: yuntaehun
  Date: 2/22/24
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 점수 등록 화면
    <form action="scoreForm" method="post">
        이름 : <input type="text" name="name">
        국어 : <input type="number" name="kor">
        수학 : <input type="number" name="eng">
        영어 : <input type="number" name="math">
        <input type="submit" value="등록">
    </form>
</body>
</html>
