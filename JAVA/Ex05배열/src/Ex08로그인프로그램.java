import java.util.Scanner;

public class Ex08로그인프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] id_array = new String[3]; // 회원 아이디 저장할 배열
		int[] pw_array = new int[3];	   // 회원 비밀번호 저장할 배열
		
		int cnt = 0; // 가입된 회원 수
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : // 회원가입
				if(cnt >=3) {
					System.out.println("회원가입 실패");
					break;
				}
				System.out.println("===회원가입===");
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				int pwd = sc.nextInt();
				
				id_array[cnt]=id;
				pw_array[cnt]=pwd;
				
				cnt++;
				
				System.out.println("가입 성공");
				break;
				
			case 2 : // 로그인
				System.out.println("===로그인===");
				System.out.print("id 입력 :");
				String inputid = sc.next();
				System.out.print("pw 입력 :");
				int inputpwd = sc.nextInt();
				
				boolean inLogin = false;
				for(int i=0; i<cnt; i++) {
					if(id_array[i].equals(inputid)&&pw_array[i]==(inputpwd)) {
						System.out.println("로그인 성공!");
						inLogin = true;
						break;
					}
					}
				if(!inLogin) {
					System.out.println("로그인 실패...");
				}
				break;
				
			case 3 : default : // 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			
			
		}

	}

}
