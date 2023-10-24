import java.util.Scanner;

public class Ex06while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		do {
			// 정수 입력 받기
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();

			// 연산자 입력 받기
			System.out.print("연산자(+/-) : ");
			char operator = sc.next().charAt(0);

			// 입력한 연산자가 + 또는 - 가 아니면 "다시 입력해주세요" 출력
			if (operator == '+' || operator == '-') {
			} else {
				System.out.println("다시 입력해주세요");
			}

			// 입력한 연산자에 따라 계산하고 출력
			if (operator == '+') {
				System.out.printf("%d %c %d = %d\n", num1, operator, num2, num1 + num2);
			} else if (operator == '-') {
				System.out.printf("%d %c %d = %d\n", num1, operator, num2, num1 - num2);
			}

			// 계속할지 여부 입력 받기
			System.out.print("계속하시겠습니까? (Y/N) ");
			char go = sc.next().charAt(0);

			// Y를 입력하면 이전 입력 값들 초기화 후 다시 반복문 실행
			if (go == 'Y') {
				num1 = 0;
				num2 = 0;
				continue;
			}
			// N을 입력하면 "종료" 출력하고 반복문 종료
			else if (go == 'N') {
				System.out.println("종료");
				break;
			}
			// Y 또는 N 이외의 다른 문자를 입력하면 "다시 입력해주세요" 출력 후 반복문 종료
			else {
				System.out.println("다시 입력해주세요");
				break;
			}
		} while (true); // 무한 반복문

	}

}
