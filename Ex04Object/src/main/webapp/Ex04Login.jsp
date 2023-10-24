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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String move = null;
		
		if(id.equals("smart")&&pw.equals("123")){
			// id값을 보내는 방법
			// 1. url 에 데이터를 추가해서 요청하는 방법 => Query String
			// QueryString url?name1=value1&name2=value2
			// response.sendRedirect("Ex04LoginSuccess.jsp?id="+id); => Redirecting(리다이렉팅)
			
			// 2. request객체를 다음 페이지로 넘겨주는 방법(공유하는 방법) => forwarding(포워딩)
			// RequestDispatcher : 클라이언트로부터 최초에 들어온 요청(request)을 
			//					   원하는 자원으로 넘기는 등의 메서드를 가지고 있는 객체
			RequestDispatcher rd = request.getRequestDispatcher("Ex04LoginSuccess.jsp");	
			// 지정한 자원으로 request 객체 (response 객체) 넘기기!
			rd.forward(request, response);
			
			
		}else{
			response.sendRedirect("Ex04LoginFall.jsp");
		}
		
		
		response.sendRedirect(move);
		
		//request.setAttribute("id", id); //경로에 보낼 데이터
		//RequestDispatcher rd = request.getRequestDispatcher(move); // (경로)
		
		// 해당 경로로 이동할때 request객체와 response 객체를 가져간다.
		//rd.forward(request, response); 
		
	%>
</body>
</html>