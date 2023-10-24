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
		// 모든 클라이언트들이 공통적으로 사용하는 값ㅇ
		application.setAttribute("nickname", "서태웅");
		String nick = (String)application.getAttribute("nickname");
	%>
	<%=nick %><br>
	${nickname }
	${applicationScope.nickname }
	<a href="Ex04application2.jsp">2로 이동</a>
</body>
</html>