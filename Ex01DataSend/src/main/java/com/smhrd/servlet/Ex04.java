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

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String ope = request.getParameter("ope");
		double result = (double) num1 / num2;
		int a = 0;
		
		System.out.println(ope);
		
		// 응답
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		switch (ope) {
		case "plus":
			a = num1 + num2;
			break;
		case "minus":
			a = num1 - num2;
			break;
		case "mul":
			a = num1 * num2;
			break;
		case "div":
			a = num1 / num2;
			break;
		}
		if (ope.equals("/")) {
			out.printf("%d %s %d = %.2f", num1, ope, num2, a);
		} else {
			out.printf("%d %s %d = %d", num1, ope, num2, a);
		}
	}

}
