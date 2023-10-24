import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int time = sc.nextInt(); // 초 입력
		
		// 3723초 -> 1시(3600초) 2분(60초) 3초
		int hour = time/3600;
		int minute = (time%3600)/60;
		int second = time%60;
		
		System.out.printf("%d시 %d분 %d초", hour, minute, second);
	}

}
