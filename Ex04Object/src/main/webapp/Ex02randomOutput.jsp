<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>랜덤 당첨 게임</h2>
	<fieldset style="width: 300px;">
		<legend>랜덤뽑기결과</legend>
	<%
	String text = request.getParameter("text");
	String[] item = request.getParameterValues("item");
	Random rd = new Random();
	int r = rd.nextInt(item.length);
	
	out.print(text+"<br>");
	out.print(item[r]);
	%>
	</fieldset>
</html>