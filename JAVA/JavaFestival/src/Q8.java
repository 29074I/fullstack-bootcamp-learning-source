import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A, B 숫자를 입력 받는다.
		// A-B를 출력한다.
		// A와 B가 모두 0을 입력 받으면 프로그램이 종료

		do {
			System.out.print("A 입력 >> ");
			int a = sc.nextInt();
			System.out.print("B 입력 >> ");
			int b = sc.nextInt();

			int sum = 0;
			sum = a + b;
			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.printf("결과 >> %d\n", a - b);

			}

		} while (true);
	}
}