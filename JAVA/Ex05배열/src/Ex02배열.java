import java.util.Arrays;

public class Ex02배열 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 저장하는 배열의 참조값을 가지는 레퍼런스 변수 선언
		int[] array;

		// 2. 크기가 10인 배열 생성 후 참조값을 변수에 저장
		array = new int[10];
		
		// 3. 0 ~ 9 인데스에 값 초기화(할당)
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;
		array[4] = 14;
		array[5] = 15;
		array[6] = 16;
		array[7] = 17;
		array[8] = 18;
		array[9] = 19;
		
		// 4. 배열의 모든 값 출력
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		// 도구 - 객체(인스턴스)
		// toString(객체가 가지고 있는 공통 기능)
		// : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
		// Arrays 도구(객체)가 가지고 있는 toString 메서드 호출
		// toString 반환타입 ? String
		System.out.println(Arrays.toString(array)); //[10,11,12,...]
		
		// 5. 1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력
		System.out.println(array[1]+array[4]);
		
		// 6. 각 인덱스에 저장된 모든 값을 더하여 출력
		// 누적합
		int sum = 0; // 누적합을 저장하고 있을 변수
		for(int i=0; i<array.length;i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		// 7. 배열 안에 있는 수의 평균 구하여 출력
		System.out.println(sum/(double)array.length);
	}

}
