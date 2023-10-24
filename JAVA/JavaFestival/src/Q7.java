import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 행 개수를 받아 삼각형 모양의 별을 출력

		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		// i는 현재 출력할 행의 번호를 나타냄
		// j는 현재 출력할 열의 번호를 나타냄
		// i가 증가할수록 j도 증가, '*'을 출력 ..왜?
		for (int i = 1; i <= num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("*");

				// 각 행이 끝날 때마다 마지막에 '*'을 출력하여 삼각형 모양을 만듦
			}
			System.out.println("*");

		}

	}

}
