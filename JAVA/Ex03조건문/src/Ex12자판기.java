import java.util.Scanner;

public class Ex12자판기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 조건이 2~3개인경우 -> if
		// 조건이 그 이상인 경우 -> switch
		System.out.print("넣을 금액 : ");
		int input = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();

		int money = 0; 		// 메뉴금액 값 초기화
		switch (menu) {

		case 1:
			money = 1800;
			break;
		case 2:
			money = 2000;
			break;
		case 3:
			money = 1200;
			break;
		}

		if (money <= input) { 			// 메뉴금액 보다 입력받은금액이 더 크거나 같을 경우
			int price = input - money;  // 잔돈 = 입력받은금액 - 메뉴금액
			System.out.printf("잔돈 : %d원\n", price);
			System.out.printf("천원 : %d\n", price / 1000);
			System.out.printf("오백원 : %d\n", price % 1000 / 500);
			System.out.printf("백원 : %d\n", price % 500 / 100);
		} else {
			System.out.println("돈이 부족해요 ㅠㅡㅜ");
		}
	}

}
