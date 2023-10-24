package 메서드;

public class Ex06메서드 {

	public static void main(String[] args) {
	
		// main안에 코드는 손대지 않기
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
		
	}

	// 매개변수 2 -> int
	// add -> 메서드명
	// 출력하는 기능을 가지고 있음 -> 리턴타입이 없다 (void)
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void mul(int a, int b) {
		System.out.println(a*b);
	}
	public static void div(int a, int b) {
		System.out.println(a/b);
	}
	
	
	
}
