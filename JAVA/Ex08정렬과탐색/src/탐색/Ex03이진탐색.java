package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {
	
		// 배열 선언 및 초기화
		int[] arr = {10,24,7,68,42,82,3,43,22,84};
		// 배열에서 숫자 68이 몇 번째 index에 저장되어 있는지 출력하시오.(이진검색 활용)
		
		// 선택_오름차순
		// 필요한 변수 2개
		// 1. 치환
		int temp;
		// 2. 가장 작은 값을 가진 인덱스의 값이 저장될 변수 
		int index;
		
		for(int i=0; i<arr.length-1;i++) { 
			index = i;
			for(int j=i; j < arr.length; j++) {
			if(arr[index] > arr[j]) {
				index = j;
			}
		}
			
			// 치환
			// 제일 작은 값을 0번인덱스로 보내자 두번째 1번인덱스
			if(i != index) {
				// 원래 숫자의 자리와 제일 작은 숫자가 저장된 자리가 다를 때만 치환
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;	// 0번인덱스에 가장 작은값이 들어온 상태
			}
		}
		
		
		
		
		// 버블정렬
//		int temp;
//		for(int j=0; j<arr.length-1;j++) {
//			for(int i=0; i<arr.length-1-j;i++) {
//				if(arr[i]>arr[i+1]) {
//					temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//			}
//		}		
//	}
//		System.out.println(Arrays.toString(arr));
		
		// 오름차순
		// 이진탐색 : 배열에 있는 데이터가 꼭 정렬이 되어있어야 한다
		int num = 68;

		int lowIndex = 0;
		int highIndex = arr.length-1;
		
		while(true) {
			int middleIndex = (lowIndex + highIndex)/2;
			// 1. middle에 있는 데이터랑 num이랑 같은지 판단
			if(arr[middleIndex]==num) {
				System.out.println(middleIndex);
				break;
			}else {
				// middle에 있는 값보다 작은지? 큰지?
				// low, high값을 재설정
				if(arr[middleIndex]>num) {
					highIndex = middleIndex -1;
				}else {
					// arr[m] < num
					lowIndex = middleIndex +1;
				}
			}
		}
	}
}


