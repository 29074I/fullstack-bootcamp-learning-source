import java.util.Scanner;

public class Ex08삼항연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pay = 9000;

		System.out.print("노동시간을 입력하세요 : ");
		int hour = sc.nextInt();

		// System.out.println("총 임금은 " + ((hour > 8) ? (int) ((hour - 8) * pay * 1.5 + 72000) : hour * pay) + "원 입니다");

		// 기본 시급 : 9000	// 8~ (초과한 시간에 대해서만 1.5배)
		// 8시간 이하 근무 : 9000 * 일한 시간(hour)
		// 8시간 초과 근무 : 8*9000 + (일한 시간(hour) - 8) * 9000 * 1.5
		
		int 기본시급 = 9000;
		
		// 실수 -> 정수 형변환 절대 자동형변환 해주지 않음
		// 같은 크기더라도 실수가 표현범위가 더 넓기 때문
		double p = (hour>8)? 8*기본시급 + (hour - 8) * 기본시급 * 1.5: 기본시급*hour;
		System.out.printf("총 임금은 %.0f원 입니다", p);
	}

}
