import java.util.Scanner;

public class Ex06삼항연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1 - num2;
		System.out.println((result>=0)?result: -result); // -1*result
		
		System.out.println("두 수의 차 : "+((num1>num2)? num1-num2 : num2-num1));

	}

}
