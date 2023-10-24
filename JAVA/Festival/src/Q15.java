import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수 n을 입력받아 1,2,4,7,11과 같은 수열의 n번째 항까지 출력

		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		for (int i=0, j=1; i<n; i++) {
			j += i;
			System.out.printf("%d ", j);
		}
	}
}
