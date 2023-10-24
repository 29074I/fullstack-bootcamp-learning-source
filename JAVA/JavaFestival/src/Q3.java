
public class Q3 {

	public static void main(String[] args) {
		 // 1-2+3-4+...+99-100 을 계산하여 답을 출력

	      // 합을 저장할 변수 선언 및 초기화
	      int sum = 0;

	      for (int i = 1; i <= 100; i++) {
	         if (i % 2 == 0) {    // 현재 정수가 짝수인 경우
	            System.out.printf(" -%d ", i);    // "-i"문자열출력
	            sum -= i;       // 합에서 i값을 뺌
	         } else {          // 현재 정수가 홀수인 경우
	            System.out.print(i);
	            sum += i;      // 합에서 i값을 더함
	         }
	      }
	      System.out.printf("\n결과 : %d", sum);


	}

}
