import java.util.Scanner;

public class Ex05ifelse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("소프트웨어 설계 : ");
		int a = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int b = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int c = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int d = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int e = sc.nextInt();

		int sum = a + b + c + d + e;

		// 합격 조건
		// 1. 각 과목의 개수가 모두 8이상
		// 2. 과목의 총 합이 60 이상 -> 두 조건 모두 해당
		if (sum >= 60 && a>=8 && b>=8 && c>=8 && d>=8 && e>=8) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
	}

}
