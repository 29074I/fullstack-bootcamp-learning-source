import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 랜덤, 입력하는 도구 가져오기
		Random rd = new Random();

		// rd.nextInt(); -> int범위 모든 수
		// rd.nextInt(10); -> 0부터 9사이

		// 1 ~ 10 랜덤한 숫자 -> rd.nextInt(10)+1

		// 랜덤기능 사용해서 랜덤한 숫자 2개 가져오기
		// : 나중에 답을 구할 때 사용할 예정이니 저장하기(변수)
		System.out.println("===Plus Game==");

		int fail = 0;

		do {
			int n1 = rd.nextInt(50) + 1;
			int n2 = rd.nextInt(50) + 1;

			System.out.printf("%d + %d = ", n1, n2);

			int sum = sc.nextInt();

			if (n1 + n2 == sum) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				fail++;
				if (fail == 3) {
					System.out.println("game over");
					break;
				}
				System.out.print("계속 하시겠습니까? >> ");
				char answer = sc.next().charAt(0);

				if (answer == 'N') {
					System.out.println("종료합니다.");
					break;
				}

			}

		} while (true);

	}
}
