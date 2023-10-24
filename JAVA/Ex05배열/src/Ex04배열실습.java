import java.util.Arrays;
import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		// 랜덤 객체
		// 레퍼런스 변수
		Random rd = new Random();

		// 배열을 랜덤값으로 초기화
		int[] arr = new int[10];
		// 정수배열을 선언 기본값 0 -> 초기화 먼저

		int max = 0;
		int min = 20;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20)+1;
			System.out.printf("%d ",arr[i]);
			if (max < arr[i]) {  // 최대값
				max = arr[i];
			}if (min > arr[i]) { // 최소값
				min = arr[i];
			}
		}
		System.out.printf("\n가장 큰 값 : %d\n", max);
		System.out.printf("가장 작은 값 : %d", min);
	}
}
		

		
		// 배열 초기화
//		for(int i=0; i<arr.length;i++) {
//			arr[i] = rd.nextInt(20)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int max = arr[0]; // 내가 지금까지 본 숫자중에 가장 큰 숫자
//		int min = arr[0]; // 내가 지금까지 본 숫자중에 가장 작은 숫자
//
//		//최대값
//		for(int i=0; i<arr.length; i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//		}System.out.println(max);
//		
//		//최소값
//		for(int i=0; i<arr.length; i++) {
//			if(min>arr[i]) {
//				min = arr[i];
//			}
//		}System.out.println(min);
//
//	}
//
//}
