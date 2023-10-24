import java.util.Random;
import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int fail=0;
		do {
			if(fail==5) {
				System.out.println("GAME OVER!");
				break;
			}
			int a = rd.nextInt(10) + 1;
			int b = rd.nextInt(10) + 1;
			System.out.printf("%d + %d = ", a, b);
			int input = sc.nextInt();
			
			if((a+b)==input) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
				fail++;
			}

		} while (true);
	}

}
