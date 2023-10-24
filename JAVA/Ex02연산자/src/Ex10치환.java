
public class Ex10치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		
		String temp;		// 임시 저장공간 선언  // 초기화를 안함
		String temp1 = null;	// 초기화를 함  null -> 비어있는 값 / reference type만 가능
		// int temp2 = null;  기본타입은 null로 초기화x
		
		temp = right;	// left : red , temp : blue , right : blue
		right = left;	// left : red , temp : blue , right : red
		left = temp;	// left : blue , temp : blue . right : red
		
		System.out.println(left); 	// blue
		System.out.println(right); 	// red
	}

}
