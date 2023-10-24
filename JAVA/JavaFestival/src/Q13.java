import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수입력 :");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num = sc.nextInt();
		
		System.out.printf("%d단\n",dan);
		
		for(int i = 1; i <= num ; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
		}

	}

}
