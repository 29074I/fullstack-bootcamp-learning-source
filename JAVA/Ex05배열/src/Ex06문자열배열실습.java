import java.util.Scanner;

public class Ex06문자열배열실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 이 배열안에 들어있는 값이 중복되지 않는다! (가정)
		
		String[] arrStr = {"김지은","박수현","정세연","이명훈","강예진","임명진","정형","채수민"};
		
		System.out.print("검색할 이름 입력 >> ");
		String name = sc.next();
		
		for(int i =0; i<arrStr.length;i++) {
			// == : 기본타입(primitive type)  비교시에만 사용
			// int char long byte short float boolean double
			if(arrStr[i].equals(name)) { 
				System.out.printf("%s님은 %d번째 인덱스에 저장되어 있습니다.",name,i);
				break; // 가장 가까운 반복문 나가는 키워드
			}
		}

	}
}
