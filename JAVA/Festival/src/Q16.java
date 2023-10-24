import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 12345678 -> 1+2+3+4+5+6+7+8
		
		int sum = 0;
		int num = 0;
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.printf("합은 %d입니다.",sum);
	}

}
