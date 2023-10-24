import java.util.Scanner;

public class Ex06다중ifelse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력 : ");
		int score = sc.nextInt();

		// score 90 점 이상 : A
		// score 80 점 이상 90점 미만 : B
		// score 70 점 이상 80점 미만 : C
		// score 70점 미만 : F

		if (score >= 90) { // 90인 점수는 다 걸러줌
			System.out.println("A");
		} else if (score >= 80) { // 90 미만인지는 물어볼 필요가 없음
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}

}
