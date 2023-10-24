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
		session.setAttribute("nickname", "정대만");
		String nick = (String)session.getAttribute("nickname"); // 다운캐스팅
	%>
	<%=nick %><br>
	${nickname }
	<a href="Ex03session2.jsp">2로 이동</a>
</body>
</html>