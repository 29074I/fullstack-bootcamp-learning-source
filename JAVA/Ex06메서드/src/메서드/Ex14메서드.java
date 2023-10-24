package 메서드;

public class Ex14메서드 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
		
		// 전달인자 : String 1개
		// 매개변수 : String 1개
		// 리턴타입 : String 
		
		
	}

	public static String getMiddle(String a) {
		// 글자 수가 짝수개이면 2개 리턴
		// a.length() : 문자열의 길이를 알수가 있다
		// 글자의 위치는 만약에 6글자면 3,4위치해있는 글자가 return
		// 글자 수가 홀수이면 1개 리턴
		// 글자의 위치가 만약에 5글자면 3위치해있는 글자가 return
		int len = a.length()/2;
		
		if(a.length()%2==0) {
			// 짝수
			// text ---> es
			return ""+a.charAt(len-1)+a.charAt(len);
		}else {
			// 홀수
			// abcde
			// "" + int / char : 뒤에 있는 데이터타입이 자동으로 String 형변환
			return ""+a.charAt(len);
		}
		
		// index ---> 0부터 시작
		// String ---> char[] ---> 0
		
		
		
	}
	
	
	
}
