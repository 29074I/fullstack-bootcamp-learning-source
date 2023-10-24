import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC회원관리 {
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		//(1)로그인 (2)회원가입 (3)닉네임 조회 (4)종료
		//4번을 누기 전까지 1,2,3 메뉴를 계속 선택할 수 있도록 만들어 주세요!
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.print("(1)로그인 (2)회원가입 (3)전체 회원 조회 (4)회원삭제 (5)회원 정보 수정 (6)종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("---로그인 시도---");
				//사용자로 부터 ID, PW 를 입력받아서 모두 DB에 있는 내용과 맞다면
				// 'nick 님 환영합니다' -->'점심짜장저녁냉면 님 환영합니다' 
				System.out.print("ID 입력>>");
				String inputId = sc.next();
				System.out.print("PW 입력>>");
				String inputPw = sc.next();
				
				String nick = dao.login(inputId, inputPw);
				if(nick != null) {
					System.out.println(nick+"님 환영합니다!");
				}				
					
			}
			else if(menu == 2) {
				System.out.println("---회원가입 시도---");
				//id, pw, nick 를 사용자로 부터 입력 받아서 member 테이블에 저장해주세요!
				System.out.print("ID 입력 >> ");
				String inputId = sc.next();
				System.out.print("PW 입력 >> ");
				String inputPw = sc.next();
				System.out.print("NICK 입력 >> ");
				String inputNick = sc.next();
				
				//JDBC 사용 순서
				//1. DB 연결
				//2. 쿼리문 실행
				int result = dao.join(inputId, inputPw, inputNick);
				if(result>0) {
					System.out.println("회원가입 성공!");
				}
				else {
					System.out.println("회원가입 실패!");
				}
				//3. 연결 해제 -> 역순!
			
				
			}
			else if(menu == 3) {
				System.out.println("---전체 회원 조회---");
				//ID : 승환  PW : 123 NICK : 점심짜장저녁냉면
				//ID : 예진  PW : 1234 NICK : 예진예진
				//ID : 승환2  PW : 1234 NICK : Test
				ArrayList<UserDTO> userList =  dao.userList();
				
				if(userList.size()>0) {
					for(int i=0;i<userList.size();i++) {
						String id = userList.get(i).getId();
						String pw = userList.get(i).getPw();
						String nick = userList.get(i).getNick();
						System.out.println("ID : "+id+" PW : "+pw+"NICK : "+nick);
					}
				}
				else {
					System.out.println("아직 가입한 회원이 없습니다!");
				}
				
				
			}
			else if(menu == 4) {
				System.out.println("회원 삭제");
				System.out.print("삭제할 회원의 ID 를 입력해주세요>>");
				String inputId = sc.next();
				
				int result = dao.deleteUser(inputId);
				
				if(result>0) {
					System.out.println("회원삭제 성공!");
				}
			}
			else if(menu==5) {
				System.out.println("회원 NICK 수정");
				System.out.print("수정할 회원의 ID를 입력해주세요>>");
				String inputId = sc.next();
				System.out.print("수정하고 싶은 NICK을 입력해주세요>>");
				String inputNick = sc.next();
				
				int result = dao.updateUser(inputId, inputNick);
				if(result>0) {
					System.out.println("회원정보 수정 완료!");
				}
				
			}
		}
		
		
	}
	

}
