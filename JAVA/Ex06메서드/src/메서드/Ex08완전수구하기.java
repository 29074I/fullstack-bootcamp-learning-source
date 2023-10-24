package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor); // true
		// num2가 num1의 약수인지 아닌지?
		// num1이 num2의 배수인지 아닌지?
		// num2가 num1을 나누어 떨어지게 하는지

		getDivisor(10);
		// 10의 약수 : 1 2 5 10
		getDivisor(16);
		getDivisor(24);

		int num = 10;
		int result = getSumOfDivisors(num);
		System.out.printf("\n%d의 약수의 합 : %d", num, result);
		getDivisor(10);
		System.out.println();

		// 완전수인지 아닌지 판단해주는 isPerfectNumber()
		// 완전수란, 자기자신을 제외한 약수의 합이 자기자신과 같은 수
		// 6 : 1 2 3 --> 6 (완전수)
		// 10 : 1 2 5 --> 8 (완전수가 아님)
		// 28 : 1 2 4 7 14 2--> 28 (완전수)
		// true, false
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2); // true / false
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		// s ~ e 완전수를 찾아서 출력
		
	}

	// 1. isDivisor() -> 매개변수 int 2개, 리턴타입 boolean(true, false)
	public static boolean isDivisor(int num1, int num2) {
		// num2가 num1을 나누어 떨어지게 하는지 판단
		boolean divisor;
		if (num1 % num2 == 0) {
			divisor = true; // return true;
		} else {
			divisor = false; // return false;
		}
		return divisor;
		// is라는 키워드가 붙은 메서드는 결과값(리턴타입)이 boolean
	}

	// 2. getDivisor() -> 출력하는 기능을 가지고 있다(void), 매개변수 int 1개
	public static void getDivisor(int num1) {
		// num1의 약수를 출력하는 기능
		// num1의 약수 : 1 2 4
		System.out.printf("\n%d의 약수 : ", num1);
		for (int i = 1; i <= num1; i++) {
			// i가 num1의 약수인지 아닌지? ---> true/false
			// isDivisor()
			// num2가 num1의 약수인지 아닌지 ? ---> true/false
			if (isDivisor(num1, i)) { // (num1%i==0)
				System.out.printf("%d ", i);
			}
		}
	}

	// 3. getSumOfDivisors() -> 매개변수 int 1개, 리턴타입 int
	public static int getSumOfDivisors(int num) {
		// num1의 약수들의 합
		int sum = 0; // 약수들의 합이 들어갈 공간
		// 1. 약수인지 아닌지 판단
		// 2. 누적(합계)
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum;
	}

	// 4. isPerfectNumber() -> 매개변수 int 1개, 리턴타입 boolean
	public static boolean isPerfectNumber(int num3) {
		// 자기자신을 제외한 약수의 합 == 자기자신
		// 약수의 합 = 자기자신 * 2
		if(getSumOfDivisors(num3) - num3 == num3) { // 자기자신(num3)을 뺀 약수의 합이 
			return true;		  // 자기자신(num3)과 같으면 완전수-> true
		} else {
			return false;		  // 그렇지 않으면 완전수 x -> false 
		}
	}

	// 5. getPerfectNumber() -> 매개변수 int 2개, 출력하는 기능(void)
	public static void getPerfectNumber(int num1, int num2) {
		// num1 -> s, num2 -> e
		System.out.printf("%d~%d까지의 완전수 : ",num1,num2);
		// 2라는 숫자가 완전수인지 아닌지 판단 --true--출력
		for(int i=num1; i<=num2;i++) {
			if(isPerfectNumber(i)) {  // == true 
				System.out.printf("%d ",i);
			}
		}
	}





}
