package com.smhrd.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 회원관리된 요청 받아줄 프론트 컨트롤러 (회원가입, 로그인)
// 요청 구분 -> 프론트 컨트롤러 : *.doex) login.do -> 로그인 요청 / join.do -> 회원가입 요청
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Command> list = null;

	// 최초로 요청이 들어왔을 때 딱 한번만 실행

	public void init(ServletConfig config) throws ServletException {
		// 여기로 들어올 수 있는 요청 경로를 미리 리스트로 만들어놓기
		// map 사용!(key-value쌍으로 묶어놓을 것이기 때문에 map을 사용) ** map은 순서가 없는 구조
		// (key(요청 경로-join.do/login.do를 문자열로) - value(그 기능을 수행해줄 컨트롤러 객체))
		list = new HashMap<>();
		list.put("/Join.do", new JoinController());
		list.put("/login.do", new LoginController());
		// join.html과 login.html에서 action값과 동일한지 확인
		// 웹문서 수정 후에도 이전 문서를 보여준다면 ? -> ctrl + F5 : 완전 새로고침
		

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		// uri를 자를 건데 path의 길이만큼 자르겠다!
		String subUri = uri.substring(path.length()); // substring은 길이를 잘라주는 것

		System.out.println(uri);
		System.out.println(path);
		System.out.println(subUri);

		// Command -> process()를 가지고 있음, 호출 가능
		Command controller = list.get(subUri);
		String des = controller.process(request, response);
		System.out.println(des);
		response.sendRedirect(des);

	}

}
