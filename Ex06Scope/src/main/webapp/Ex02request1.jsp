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
		request.setAttribute("nickname", "정대마니");
		String nick = (String)request.getAttribute("nickname");
		
		//pageContext.setAttribute("nickname", "서태웅니");
		//String nick1 = (String)pageContext.getAttribute("nickname");
		
	%>
	
	<%=nick %> <br>
	${nickname } <!--  2개 이상의 영역에서 같은 name 값을 사용하면 더 좋은 영역에 값을 가지고옴 -->
	${requestScope.nickname }
	
	
	<a href="Ex02request2.jsp">2로 이동</a>
</body>
</html>