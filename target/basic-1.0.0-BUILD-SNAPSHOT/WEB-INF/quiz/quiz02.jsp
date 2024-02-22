<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	이 화면에 진입할 때 List[MemberVO, MemberVO, MemberVO] 형태의 데이터를 출력해주세요.
	데이터는 가짜로 생성하면 됩니다.
	a링크를 하나 만들고 회원정보를 클릭하면 회원정보화면으로 회원번호를 넘겨주세요
	 --%>
	<h2>목록</h2>
	<ul>
		<c:forEach items="${data}" var="item" >

			<p>ID: ${item.id}</p>
			<p>Name: ${item.name}</p>
			<p>Age: ${item.age}</p>
			<br>
		</c:forEach>
	</ul>

	<a href="quiz02_data?data=<c:forEach items="${data}" var="item" >
											${item.id}
		</c:forEach>">회원 정보 넘기기</a>
	
	
</body>
</html>