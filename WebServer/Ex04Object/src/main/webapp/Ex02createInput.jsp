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
	int num = Integer.parseInt(request.getParameter("num"));
	
	%>
	<h2><% out.print("랜덤 당첨 게임");%></h2>
	<fieldset style="width: 300px;">
	<legend>랜덤뽑기</legend>
	<form action="Ex02randomOutput.jsp">
	<table>
		<tr>
			<td><%out.print("주제 : ");%></td>
			<td><input type="text" name="text"></td>			
		</tr>

		<%for(int i=1; i<=num; i++){%>
		<tr>
			<td>아이템 : </td>
			<td><input type="text" name="item"></td>
		</tr>
		<%}%>			

		<tr>
			<td><input type="submit" value="랜덤뽑기"></td>
		</tr>
	</table>
	</form>
	</fieldset>
	

</body>
</html>