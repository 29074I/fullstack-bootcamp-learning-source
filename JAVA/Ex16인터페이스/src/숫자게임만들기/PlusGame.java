package 숫자게임만들기;

import java.util.Random;

public class PlusGame implements OperatorGame {
	// 개발자 1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기
	Random rd = new Random();
	int num1=0;
	int num2=0;	// 전역변수로 사용
	
	@Override
	public int random() {
		// 랜덤한 수를 하나 생성해서 리턴
		return rd.nextInt(50)+1;
	}
	
	@Override
	public String getQuizMsg() {
		// 랜덤한 숫자 두개를 출력해서 문자열로 돌려주는 기능
		num1=random();
		num2=random();
		return num1+" + "+num2+" = ";	// 문제를 출제

	}

	@Override
	public boolean checkAnswer(int ans) {
		if(num1+num2==ans) {
			return true;
		}else {
			return false;
		}
	}
}
	
