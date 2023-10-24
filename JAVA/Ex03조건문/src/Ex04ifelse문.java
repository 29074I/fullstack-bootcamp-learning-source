import java.util.Scanner;

public class Ex04ifelse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 :");
		int total = sc.nextInt();
		System.out.print("사람 명 수 :");
		int people = sc.nextInt();		
		
		int dutchPay = total/people;
		
		if(dutchPay>=10000) { // 1인 당 지불해야하는 금액이 10000원 이상이니?
			// 참
			System.out.println("10000원 이상 지불");
		}else {
			// 거짓
			System.out.println("10000원 미만 지불");
		}
	}

}
