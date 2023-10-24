<%@page import="java.util.List"%>
<%@page import="com.smhrd.model.FullStack"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 세션 안에 저장되어 있는 학생정보(3명) 테이블 형태로 출력 -->
	<!--  -->
	<%
	List<FullStack> al = (List<FullStack>) session.getAttribute("list");
	%>

	<table border=1>
		<tr>
			<th>이름</th>
			<th>전공</th>
			<th>전화번호</th>
		</tr>
		<%for(FullStack fs : al) {%>
		<tr>
			<td><%=fs.getName()%></td>
			<td><%=fs.getMajor()%></td>
			<td><%=fs.getPhone()%></td>
		</tr>
		<%}%>
	</table>
</body>
</html>