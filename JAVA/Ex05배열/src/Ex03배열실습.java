
public class Ex03배열실습 {

	public static void main(String[] args) {

		// 1. 크기가 10인 배열 생성 원하는 값으로 초기화
		// {}
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		
		// 2. 배열의 값 중 홀수만 출력, 홀수가 몇개인지 출력
		int sum = 0;
		System.out.print("배열 홀수 : ");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.printf("%d ", arr[i]);
				sum++;
			}
		}
		System.out.printf("\n총 개수 : %d개", sum);
	}
}
