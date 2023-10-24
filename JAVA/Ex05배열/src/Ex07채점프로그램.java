import java.util.Scanner;

public class Ex07채점프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = {1,4,3,2,1}; // 실제 답
		int[] input = new int[5]; // 사용자가 입력한 답 저장
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		int sum = 0; // 총점 저장
		String check = "";
		
		// 답 입력
		for (int i = 0; i < input.length; i++) {
			System.out.printf("%d번답 >> ", i+1);
			input[i] = sc.nextInt();
			

				if(a[i]==input[i]) { // 같을경우
					check+="O ";
					sum+=20;
				}else { // 다를 경우
					check+="X ";
				}
			
	}
		System.out.println(check);

		
		// 입력한 답과 실제답이 같으면 O 출력, 다르면 X 출력
		System.out.println("정답확인 ");
		System.out.printf("총 점 : %d",sum);

	}
}
