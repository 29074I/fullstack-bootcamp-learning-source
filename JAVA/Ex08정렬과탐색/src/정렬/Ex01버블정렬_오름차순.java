package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {

		
		int[] arr = {10, 24, 7, 68, 42, 82, 3, 43};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		int temp; // 치환을 위한 임시공간
		boolean sw = false; // n회차 정렬이 한번이라도 일어나면 true

		// 0-1 -> 1-2 -> 2-3 -> 3-4 -> 4-5 -> 5-6
		// 중간에 정렬이 완료된 경우 더 이상 정렬을 진행하지 않는 코드 작성
		for(int j=0; j<arr.length-1;j++) {	// 7회차까지 반복
			sw = false; // 다시 초기화
			for(int i=0; i<arr.length-1-j;i++) { // 5번까지
				if(arr[i]>arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sw = true;
				}	
			}
			if(!sw) {	// sw가 false 일때만 수행 (n회차 한번도 바뀌지 않았을 때)
				break;
			}
		
			System.out.println(j+1+"회차 : "+ Arrays.toString(arr));
	}
	}
}
