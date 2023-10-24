import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();

		
		// (1)로그인 (2)회원가입 (3)닉네임 조회 (4)종료
		// 4번을 누르기 전까지 1,2,3 메뉴를 계속 선택할 수 있도록 만들기
		
		int menu;
		


		while(true) { // 언제 종료를 선택할지 모르니까
			System.out.print("(1)로그인 (2)회원가입 (3)전체 회원 조회 (4)종료 >> ");
			menu=sc.nextInt();
			
			if(menu==1) {
				// 로그인
				System.out.println("===로그인 시도===");
				// 사용자로부터 id, pw 를 입력받아서 모두 DB에 있는 내용과 맞다면
				// 'nick 님 환영합니다' 출력
				// id, pw, nick를 사용자로부터 입력 받아서 member 테이블에 저장
				System.out.print("id 입력 : ");
				String inputId = sc.next();
				System.out.print("pw 입력 : ");
				String inputPw = sc.next();
				
				String nick = dao.login(inputId, inputPw);
				if(nick!=null) {
					System.out.printf("%s님 환영합니다!\n",nick);
				}
			
			}else if(menu==2) {
				// 회원가입
				System.out.println("===회원가입 시도===");
				// id, pw, nick를 사용자로부터 입력 받아서 member 테이블에 저장
				System.out.print("id 입력 : ");
				String inputId = sc.next();
				System.out.print("pw 입력 : ");
				String inputPw = sc.next();
				System.out.print("닉네임 입력 : ");
				String inputNick = sc.next();

				// JDBC 사용 순서
				// 1. DB 연결
				// 2. 쿼리문 실행
				int result = dao.join(inputId, inputPw, inputNick);
				if(result>0) {
					System.out.println("회원가입 성공!");
				}else {
					System.out.println("회원가입 실패!");
				}
				// 3. 연결 해제 -> 역순으로!
		
			}else if(menu==3) {
				// 전체 회원 조회
				System.out.println("===전체 회원 조회===");
				// id : 승환 pw : 123 nick : 닉
				// id : 승환2 pw : 123 nick : Test
				ArrayList<UserDTO> userList = dao.userList();
				
				for(int i=0; i<userList.size();i++) {
					String id = userList.get(i).getId();
					String pw = userList.get(i).getPw();
					String nick = userList.get(i).getNick();
					System.out.printf("id : %s pw : %s nick : %s\n",id,pw,nick);
				}
			}else {	// 종료
				break;
			}
		}
	}
}
