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
	String name = request.getParameter("name");
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));
	
	double avg = ((double)java+web+iot+android)/4;
	String r = "";
	if(avg>=95){
		r = "A+";
	}else if(avg>=90){
		r = "A";
	}else if(avg>=85){
		r = "B+";
	}else if(avg>=80){
		r = "B";
	}else{
		r = "F";
	}
	%>
	
	<fieldset style="width:300px;">
		<legend>학점확인프로그램</legend>
		<form action="Ex01Request.jsp">
			<table align="center">
				<tr>
					<td>이름</td>
					<td><%=name %></td>
				</tr>
				<tr>
					<td>Java점수</td>
					<td><%=java %></td>
				</tr>
				<tr>
					<td>Web점수</td>
					<td><%=web %></td>
				</tr>
				<tr>
					<td>IoT점수</td>
					<td><%=iot %></td>
				</tr>
				<tr>
					<td>Android점수</td>
					<td><%=android %></td>
				</tr>
				<tr>
				<td><%out.print("평균"); %></td>
				<td><%=avg %></td>
				</tr>	
				<tr>
				<td><%out.print("학점"); %></td>
				<td><b><%=r %></b></td>
				</tr>	
			</table>
			
		</form>
	</fieldset>
</body>
</html>