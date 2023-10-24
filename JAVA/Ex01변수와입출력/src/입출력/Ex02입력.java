package 입출력;

import java.util.InputMismatchException;

// 외부(패키지)에 존재하는 클래스를 가져가다 쓸 때에는 import 필수로 해줘야 함
import java.util.Scanner;

public class Ex02입력 {

	public static void main(String[] args) {
		
		// new Scanner() : Scanner 도구 생성
		// System.in 입력도구를 활용해서 Scanner 도구 생성하겠다
		// Scanner sc -> Scanner : 스캐너 형태의 도구의 주소를 저장할 수 있는 자료형
		
		// 컴퓨터의 자원이 많이 사용된다.
		Scanner sc = new Scanner(System.in);
		
		/*
		 * String s = sc.next(); // 스캐너로 입력된 값을 받아들임 // 스캐너가 입력된 값을 돌려줌(반환) -String ->
		 * 변수에 저장
		 * 
		 * System.out.println(s); // s변수가 가지고 있는 값을 콘솔에 출력
		 * 
		 * // Scanner : 입력한 값을 공백문자(' ', '\t', '\n')를 기준으로 분리 sc.nextLine(); // 녕 처리해버림
		 * String s2 = sc.nextLine(); System.out.println(s2);
		 */
		// ctrl + shift + / 
		
		int num = 0; // 정수형값을 저장할 수 있는 공간 생성
		try {	// 무조건 실행
			num = sc.nextInt();	// 3 -> num
		
		}catch(InputMismatchException e) { // (발생한 오류(예외상황)의 종류)
			// try 안에서 예외상황이 발생했을 때만 실행
			System.out.println("숫자로 입력해주세요");
		}
		// 런타임(실행) 오류 : 컴파일은 됨(해석은 가능)
		// 예외 처리를 해줘야 함 : try~catch
		
		System.out.println(num);
		
		sc.close(); // 스캐너가 사용하던 자원을 반환 -> sc.next(); 사용 불가능
		
		// 지역변수 : 특정 구역에서만 사용가능한 변수
		// 전역변수 : 어디에서든 사용가능한 변수
	}

}
