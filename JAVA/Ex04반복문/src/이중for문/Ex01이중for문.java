package 이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {

		// 패키지를 구분하는 이유
		// : 협업을 위해서 ->
		// 하나의 프로젝트 안에서 클래스 이름이 중복되어도 가능

		// 이중 for문을 사용해서 2단 ~ 9단 출력

		for (int i = 2; i < 10; i++) {
			System.out.printf("%d단 : ", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%d ", i, j, i*j);
			}System.out.println(); // for문을 빠져나온 후 개행

			// 지역변수 , 전역변수
			// 지역변수 : 특정 영역(scope)에서만 사용할 수 있는 변수
			// 전역변수 : 클래스 전체에서 사용할 수 있는 변수
			// 특정영역을 구분하는 방법 -> {영역}
		}
		
	}

}
