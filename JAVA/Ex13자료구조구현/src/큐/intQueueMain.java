package 큐;

import java.util.Scanner;

public class intQueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		intQueue s = new intQueue(5);
		
		int menu;
		while(true) {
			System.out.print("[1]인큐 [2]디큐 [3]피크 [4]덤프 [5]비우기 [6]위치 찾기 [7]데이터 개수 [8]종료 ");
			menu = sc.nextInt();
			if(menu==1) {
				// 인큐
				if(!s.isFull()) {
					System.out.print("데이터 : ");
					int num = sc.nextInt();
					s.enque(num);
				}else {
					System.out.println("큐가 가득 찼습니다.");
				}
			}else if(menu==2) {
				// 디큐
				if(!s.isEmpty()) {
					System.out.println("디큐할 데이터 : "+s.deque());
				}else {
					System.out.println("큐가 비어 있습니다.");
				}
			}else if(menu==3) {
				// 피크
				if(!s.isEmpty()) {
					System.out.println("피크한 데이터는 "+s.peek());
				}else {
					System.out.println("큐가 비어 있습니다.");
				}
			}else if(menu==4) {
				// 덤프
				s.dump();
			}else if(menu==5) {
				// 비우기
				if(!s.isEmpty()) {
					s.clear();
					System.out.println("스택을 비웠습니다!");
				}else {
					System.out.println("스택이 비어있습니다!");
				}
				
			}else if(menu==6) {
				// 위치 찾기
				System.out.print("찾고싶은 값 입력 : ");
				int num = sc.nextInt();
				System.out.printf("위치 : %d\n",s.indexOf(num));
			}else if(menu==7) {
				// 데이터 개수
				System.out.printf("데이터 개수 : %d\n",s.size());
			}else if(menu==8) {
				// 종료 
				break;
			}
		}

	}

}
