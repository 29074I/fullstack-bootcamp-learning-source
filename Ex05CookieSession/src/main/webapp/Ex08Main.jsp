<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// session(내장객체)
	// 세션에 저장했던 아이디 받아오기
	String id = (String)session.getAttribute("id");	// 다운캐스팅
	%>
	<%=id %>님 환영합니다
	<a href="Ex08Logout">로그아웃</a>
</body>
</html>