import java.util.Scanner;

public class Ex03if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("JAVA 점수 입력 :");
		int javaScore = sc.nextInt();
		System.out.print("Python 점수 입력 :");
		int pythonScore = sc.nextInt();
		System.out.print("Android 점수 입력 :");
		int andScore = sc.nextInt();

		int avg = (javaScore + pythonScore + andScore) / 3; // 소수점까지는 3.0
		// 92.123 > 80(->실수)

		if (avg > 80) { // 세 과목 점수의 평균이 80보다 높니?
						// 80보다 낮거나 같으면 불합격 출력
			System.out.println("합격");
		} else { // 위 경우에 해당하는 경우가 아닐 경우
			System.out.println("불합격");
		}
		System.out.println("맨아랫줄");
	}

}
