import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임 {

	public static void main(String[] args) {
		// ctrl + shift + o -> 한꺼번에 import 단축키
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("=====1부터 100 사이 숫자 맞추기 게임!=====");
		
		// 1 ~ 100 사이 랜덤한 숫자 한개 -> 답 : 한번만 실행
		int num = rd.nextInt(100) + 1;
		
		while (true) {
			System.out.print("1과 100 사이의 정수를 입력하세요 >> ");
			int input = sc.nextInt();
			// 입력한 값이 랜덤 숫자와 일치하는지 판단
			if (input == num) {
				System.out.printf("%d 정답입니다!!", num);
				break;
			} else if (input < num) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			} else {
				System.out.println("더 작은 수로 다시 시도해보세요");

			}

		}

	}

}
