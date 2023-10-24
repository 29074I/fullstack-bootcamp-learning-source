import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램
		// 최대단위 : 10000원, 최소단위 : 100원

		int total = 0;

		System.out.print("총금액 입력 : ");
		total = sc.nextInt();

		int money10k = total / 10000;
		int money5k = (total % 10000) / 5000;
		int money1k = (total % 10000 % 5000) / 1000;
		int money500 = (total % 10000 % 5000 % 1000) / 500;
		int money100 = (total % 10000 % 5000 % 1000 % 500) / 100;

		System.out.printf("\n잔돈 : %d원\n", total);
		System.out.printf("10000원: %d개\n", money10k);
		System.out.printf("5000원: %d개\n", money5k);
		System.out.printf("1000원: %d개\n", money1k);
		System.out.printf("500원: %d개\n", money500);
		System.out.printf("100원: %d개\n", money100);

	}

}
