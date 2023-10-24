import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 행 개수를 입력 받아 삼각형을 출력

		int num = 0;
		System.out.print("행 개수 : ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			// i번째 행에서 j번째 열까지 *을 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// i번째 행에서 마지막으로 *을 출력
			System.out.println("*");

		}

	}

}
