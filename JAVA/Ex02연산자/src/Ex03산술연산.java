import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int javaScore = sc.nextInt();
		
		System.out.print("WBE 점수 입력 :");
		int webScore = sc.nextInt();
		
		System.out.print("ANDROID 점수 입력 : ");
		int andScore = sc.nextInt();
		
		int sum = javaScore + webScore + andScore;
		System.out.printf("합계 : %d\n", sum);
		
		float avg = (float)sum / 3;
		System.out.printf("평균 : %.2f", avg);
	}

}
