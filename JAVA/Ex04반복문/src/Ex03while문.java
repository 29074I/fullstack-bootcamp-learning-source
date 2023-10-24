import java.util.Scanner;

public class Ex03while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0; // 지금까지 입력한 모든 수의 합 저장 
		// 누적 값을 구할 때는 0
		int odd = 0; // 홀수 개수
		int even = 0; // 짝수 개수
		while(true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if(num==-1) {
				break; // 만나는 순간 반복문 나감
			}
			if(num%2==1) { // 홀수
				++odd;
			}else { // 나머지가 0일 때 -> 짝수
				++even;
			}
			sum += num;
		}
		System.out.printf("누적결과 : %d\n",sum);
		System.out.printf("홀수결과 : %d\n",odd);
		System.out.printf("짝수결과 : %d",even);
		
System.out.println();
//		do {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num==-1) {
//				break;
//			}
//			sum += num;
//		}while(true);
//		System.out.printf("누적결과 : %d",sum);

	}

}
