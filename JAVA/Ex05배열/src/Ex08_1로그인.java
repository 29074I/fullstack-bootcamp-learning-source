import java.util.Scanner;

public class Ex08_1로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu; // 변수 선언(공간을 만든다)
		
		String id;	// 현재 로그인하는 사용자의 아이디
		String pw;	// 현재 로그인하는 사용자의 비밀번호
		int cnt = 0;	// 현재까지 회원가입한 사용자의 카운팅
		boolean sw = true;	// true : 로그인 불가 / false : 로그인 가능

		
		String[] idArray = new String[3];
		String[] pwArray = new String[3];
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.종료");
			menu = sc.nextInt(); 
			
			// 레퍼런스 기본값 -> null
			System.out.print("아이디 : ");
			for(String i : idArray) { 
				System.out.printf("%s ",i);
			}
			System.out.print("비밀번호 : ");
			for(String p : pwArray) {
				System.out.printf("%s ",p);
			}
			System.out.println();
			
			if(menu==1) { // 회원가입
				System.out.println("===회원가입===");
				
				if(cnt==3) {
					System.out.println("회원가입 불가!");
				}else {
				System.out.print("ID : ");
				idArray[cnt] = sc.next();
				System.out.print("PW : ");
				pwArray[cnt] = sc.next();
				
				// [가입할 때마다 변해야함 -> 변수 사용]
				cnt++;	// 그 다음 회원가입하는 사람은 그다음 인덱스에 저장되게!
				}	
				
			}else if(menu==2) { // 로그인
				System.out.println("===로그인===");
				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PW : ");
				pw = sc.next();
				
				// null 값은 비교 불가능
				for(int i=0; i<cnt;i++) {
					if(idArray[i].equals(id)&&pwArray[i].equals(pw)) {
						System.out.println("로그인 성공!");
						sw = false;
						break;	// 회원정보가 겹치지 않으니 가입하는 순간 더이상 확인하지 않게
					}
				}
				if(sw) {
					System.out.println("로그인 실패!");
				}
				
				
			}else { // 종료
				System.out.println("종료");
				break;
			}
		}

	}

}
