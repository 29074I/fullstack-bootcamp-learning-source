package com.smhrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw1 = request.getParameter("pw1");
		String pw2 = request.getParameter("pw2");
		String gender = request.getParameter("gender");
		String blood = request.getParameter("blood");
		String birthday = request.getParameter("birthday");
		String[] hobby = request.getParameterValues("hobby");
		String color = request.getParameter("color");
		String textArea = request.getParameter("textArea");
		
		response.setContentType("text/html; UTF-8");
		
		PrintWriter out = response.getWriter();
		out.printf("아이디 : %s<br>",id);
		out.printf("비밀번호 : %s<br>",pw1);
		if(pw1.equals(pw2)) {
			out.println("비밀번호가 일치합니다<br>");
		}else {
			out.println("비밀번호가 일치하지 않습니다.<br>");
		}
		out.printf("성별 : %s<br>",gender);
		out.printf("혈액형 : %s<br>",blood);
		out.printf("생일 : %s<br>",birthday);
		out.print("취미 : ");
		for(String i : hobby) {
			out.printf("%s ",i);
		}
		out.printf("<br>좋아하는 색깔 : %s<br>",color);
		out.printf("남기고 싶은 말 : %s",textArea);
		
		
		
		
	}

}
