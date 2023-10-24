package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	// largereNumber 메서드
	// 메서드 명 : largerNumber
	// 전달인자 num1, num2 : int ---> 매개변수 int 2개
	// 리턴타입이 int
	// int result = 출력하는 기능x
	// + 
	public static int largerNumber(int num1, int num2) {
		// num2가 더 크면 num2를 결과값으로 보내주자
		// num1이 더 크면, num2을 결과값으로 보내주자
		// num1 == num2 같으면, 0을 결과값으로 보내주자
		// + 모든 경우에 대해서 return 값이 있어야 한다
		int result = num1 < num2 ? num2 : num1;
		if (num1 == num2) {
			result = 0;
		}
		return result;
	}

}
