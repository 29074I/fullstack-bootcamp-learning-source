
public class Ex01배열생성과선언 {

	public static void main(String[] args) {
		
		// 1. 배열 생성 + 배열의 크기 (메모리에 몇개의 연속된 공간을 할당해줄것인지)
			// 레퍼런스 변수까지 선언해야지만 배열값에 접근 가능
		int[] arr = new int[5];  
		int arr2[] = new int[3];
		
		// 2. 배열에 값 저장
		arr[0] = 10;  // arr이 가리키고 있는 배열의 0번 인덱스에 값을 할당
		arr[1] = 20;  // 1번 인덱스에 값 할당
		arr[2] = 12;
		arr[3] = 34;
		arr[4] = 23;
		//arr[5] = 33;  // 프로그램을 실행하기 전까지는 arr 크기르 알 수가 없음
					  // 동적로딩 (new int[5] 실행하기 전까지는 크기 xx)
		//arr[6] = 300;
		
		// 3. 배열에 저장된 값 출력하기
		System.out.println(arr[2]);
		
		// 4. 0 ~ 4 모든 값 출력
		System.out.println(arr);  // 배열의 참조값 (heap 영역에 저장된 배열 찾아갈 때)
		// 참조값을 저장하고 있는 변수 -> 레퍼런스(참조) 변수
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		System.out.println(arr.length);
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 5. 배열에 저장되어야 하는 값을 이미 알고 있을 때
		int[] arr3 = {4,2,5,7,10};
		// 정수형 데이터가 저장될 수 있는 5칸짜리 배열 생성하고 초기화!
		System.out.println(arr3[2]);
		
		int[] intArray = new int[5];
		int[] myArray = intArray;
		
		intArray[1] = 2;
		System.out.println(intArray[1]);
		
		myArray[1] = 6;
		System.out.println(intArray[1]);
		
		
		
		
	}

}
