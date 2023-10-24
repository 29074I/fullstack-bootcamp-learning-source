import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 크기가 5인 정수형 데이터를 저장할 수 있는 배열 생성
		// -> 그 배열의 참조값(주소값)을 저장할 레퍼런스 변수 선언
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 입력 >> ", i + 1);
			score[i] = sc.nextInt();
		}

		// 배열에 저장된 모든 점수 출력하기
		// 일반 for문
		System.out.print("입력된 점수 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d ", score[i]);
		}
		
		// 확장 for문(for~each문)
		// :a 배열, List 구조에서 쓰일 수 있는 반복문
		// for(배열의 0번 인덱스에 있는 값부터 임시로 저장할 변수:배열의 레퍼런스변수이름)
		for(int a :score) {
			System.out.print(a+" ");
		}

		int max = score[0]; // 내가 지금까지 본 점수 중 최고점수
		int min = score[0]; // 내가 지금까지 본 점수 중 최저점수
		int sum = 0;
		for(int a:score) {
			sum += a;   
		}
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//			if (score[i] > max) {
//				max = score[i];
//			} else if (score[i] < min) {
//				min = score[i];
//			}
//		}
		
		for(int a:score) {
			if(max<a) { // 최고점수
				max = a;
			}
			if(min>a) {
				min = a;
			}
		}
		System.out.printf("\n최고 점수 : %d\n", max);
		System.out.printf("최저 점수 : %d\n", min);
		System.out.printf("총 합 : %d\n", sum);
		System.out.printf("평균 : %.1f", sum / (float) score.length);

	}

}
