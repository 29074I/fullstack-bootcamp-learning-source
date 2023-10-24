import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 1 ~ 100까지 중 3의 배수를 출력
		for(int i = 1; i <=100; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		// 2. 1 ~ 100까지 중 3의 배수이면서 5의 배수를 출력
		for(int i=1; i<=100;i++) {
			if(i%15==0) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println();
		
		// 3. 한 개의 자연수 --> 배수 10개 출력
		System.out.print("자연수를 입력하세요 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=10;i++) {
				System.out.print(n*i+" ");
		}

	}

}
