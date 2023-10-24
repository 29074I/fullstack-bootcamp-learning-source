import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

		 // 일한 시간을 입력받아 총 임금을 계산하는 시급계산기
	      // 시급 : 5000원
	      // 8시간보다 초과 근무한 시간에 대해 1.5배 시급이 책정
	      
	      int pay = 5000;
	      
	      System.out.print("일한시간을 입력하세요 : ");
	      int hour = sc.nextInt();
	      
	      double p = (hour<8)? hour*pay : (hour-8)*pay*1.5+40000;
	      
	      System.out.printf("총 임금은 %.0f원 입니다.", p);


	}

}
