
public class Ex01for문 {

	public static void main(String[] args) {
		
		
		// for문을 사용해서 21에서 57까지 출력
		
		for(int i = 21; i<=57; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 2 시작점 : 96 도착점 : 53 보폭 : -1
		for(int j = 96; j>=53; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		// 3-1 시작점 : 21 도착점 : 57 보폭 + 2
		for(int k = 21; k <= 57; k+=2) {
			System.out.print(k+" ");
		}
		
		// 3-2 판단(조건식)
		// 21에서 57
		for(int i = 21; i <= 57; i++) {
			if(i%2==1) {
				System.out.print(i+" ");

		}
		
		}
		
		
		
		
		

	}

}
