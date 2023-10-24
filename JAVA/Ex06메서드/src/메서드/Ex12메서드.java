package 메서드;

public class Ex12메서드 {

	public static void main(String[] args) {
		
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));
		

		// cal 메서드가 가진 기능
		// + op (+, -, *, /)
		// 만약에 +가 오면, 더한 결과값을 돌려줌
		// 매개변수(int, int, char)
		// 결과값만 받아오는 상태 : int
	}

	public static int cal(int num1, int num2, char i ) {
		
		// op가 어떤 연산자인지 판단해서 결과값을 보내줘야한다.
		if(i=='+') {
			return num1 + num2;
		}else if(i=='-') {
			return num1-num2;
		}else if(i=='*') {
			return num1*num2;
		}else{	
			return num1/num2;
		}
	}
	
}
