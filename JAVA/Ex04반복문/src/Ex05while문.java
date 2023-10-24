import java.util.Scanner;

public class Ex05while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int login = 0; // 로그인 횟수

		do {
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("비밀번호 : ");
			String pw = sc.next();

			// 아이디와 비밀번호가 맞을 경우
			if (id.equals("smhrd") && (pw.equals("1234"))) {
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("로그인 실패");

				// 로그인 실패 횟수가 3회 이상일 경우
				if (++login == 3) {
					System.out.println("본인인증을 해주세요");
					break;
				}
				System.out.print("계속 하시겠습니까? ");
				char yn = sc.next().charAt(0);
				// 계속 진행할 경우
				if (yn == 'Y') {
					continue;
				} // 종료할 경우
				else if (yn == 'N') {
					break;
				} // 잘못된 입력일 경우
				else {
					System.out.println("다시 입력해주세요(Y/N)");
				}
			}
		} while (true); // do-while문 종료
	}

}
