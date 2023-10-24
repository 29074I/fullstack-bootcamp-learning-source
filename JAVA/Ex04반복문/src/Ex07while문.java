import java.util.Random;
import java.util.Scanner;

public class Ex07while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int success = 0;
		int fail = 0;

		do {
			// 0-9 중 랜덤으로 두 개의 숫자 생성
			int a = rd.nextInt(10);
			int b = rd.nextInt(10);
			int result = a + b;

			System.out.printf("%d + %d = ", a, b);
			int input = sc.nextInt();

			// 결과값과 입력한 값이 같을 경우
			if (result == input) {
				System.out.println("Success!");
				success++;
			} else { // 결과값과 입력한 값이 다를 경우
				System.out.println("Fail!");
				fail++;
			}

			System.out.print("계속하시겠습니까? ");
			char answer = sc.next().charAt(0);
			if (answer == 'Y') {
				continue;
			} else if (answer == 'N') {
				break;
			} else { // 잘못된 입력일 경우
				System.out.println("다시 입력해주세요");
			}
		} while (true);

		System.out.printf("종료!\n맞춘개수 : %d\n틀린개수 : %d", success, fail);

	}

}
