package com.smhrd.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.WebMember;
import com.smhrd.model.WebMemberDAO;

public class UpdateController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String url = "";
		HttpSession session = request.getSession();
		
		try {
			request.setCharacterEncoding("UTF-8");
		
			WebMember membersession = (WebMember)session.getAttribute("member"); // 현재(수정전)정보
		
			String email = membersession.getEmail() ;
			// 수정 후 정보
			System.out.println(email);
			String pw = request.getParameter("pw");
			String tel = request.getParameter("tel");
			String address = request.getParameter("address");
			
			WebMember member = new WebMember(email, pw, tel, address);
			
			WebMemberDAO dao = new WebMemberDAO();
			int cnt = dao.update(member);
			System.out.println(member.getTel());
			
			if(cnt>0) {	// 수정 성공
				// 세션 값 바꾸기
				session.setAttribute("member", member); // 기존에 사용한 키값을 지정 !! "member"
				url = "index.jsp";
			}else {	// 수정 실패
				System.out.println(member.getAddress());
				System.out.println(member.getTel());
				url = "update.jsp";
			}
			
			
		}catch(UnsupportedEncodingException e) {
			System.out.println("인코딩 방식 잘못 지정함!");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return url;
	}
}

