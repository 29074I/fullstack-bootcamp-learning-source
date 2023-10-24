import java.util.Scanner;

public class Ex07삼항연산 {

	public static void main(String[] args) {
		// ctrl + shift + f 코드 자동정렬
		Scanner sc = new Scanner(System.in);

		// 1box = 5
		int box = 5;

		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();

		System.out.println("필요한 상자의 수 : " + ((ball % box == 0) ? ball / box : ball / box + 1));

		// int box = (ball%5==0)?ball/5:ball/5+1
		// System.out.println("필요한 상자의 수 : " + box);
	}

}
