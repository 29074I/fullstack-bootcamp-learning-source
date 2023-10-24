

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex08LoginCheck")
public class Ex08LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 인코딩
		request.setCharacterEncoding("UTF-8");
		
		// 폼 파라미터 가져와서 변수에 저장
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("test")&&pw.equals("12345")){
			// 세션 객체 생성
			HttpSession session = request.getSession();
			// id라는 속성명으로 저장
			session.setAttribute("id",id);
			// 메인페이지로 이동
			// - forwarding : 데이터를 포함해서 이동하고 싶다!
			// - Redirecting : 이동하고 싶다!
			// 세션에 값을 따로 저장했기 때문에 리다이렉팅이 훨 편리하다...
			response.sendRedirect("Ex08Main.jsp");
		}else {
			response.sendRedirect("Ex08LoginForm.html");
		}
	}

}
