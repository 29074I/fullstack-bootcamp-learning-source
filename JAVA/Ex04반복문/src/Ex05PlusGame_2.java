import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame_2 {
	Scanner sc = new Scanner(System.in);
	// 랜덤, 입력하는 도구 가져오기
	Random rd = new Random();
	
	 // 틀린 횟수를 저장하는 변수
	

	
	while(true) {
		int cnt = 0;
		
		// 3. 랜덤한 숫자 2개를 가져온다
		int n1 = rd.nextInt(50)+1;
		int n2 = rd.nextInt(50)+1;
		// 출력 4 + 8 =
		System.out.printf("%d + %d = ", n1, n2);
		// 답을 입력받는다
		int answer = sc.nextInt();
		//입력한 답 == 실제답 ---> s/f
		if(answer==(n1+n2)) {
			System.out.println("success");
		}else {
			//cnt++;
			//if(cnt > 2) {
				break;
			}
			// 틀렸다 -> 틀린횟수 +1
			System.out.println("fail");
			System.out.print("계속 하시겠습니까? >> ");
			String answer2 = sc.next();
			if(answer2.equals("N")) {
				break;
			}
		}
		
		
	}
}

