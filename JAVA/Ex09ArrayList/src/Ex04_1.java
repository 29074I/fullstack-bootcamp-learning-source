import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 재생목록
		ArrayList<String> musicList = new ArrayList<String>();
		
		int menu;	// 사용자가 선택한 메뉴를 저장 (1,2,3)
		
		while(true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래종료 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				printList(musicList);
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >>");
				menu = sc.nextInt();	// 이미 1번에 들어왔으니 menu 변수 다시 사용 가능
				if(menu==1) {	// 1~2
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine(); // 엔터키(공백문자) 처리
					musicList.add(sc.nextLine());	
					// sc.next() -> 공백을 기준으로 앞 문자만 출력
					// -> 임시공간인 버퍼에 뒤 문자가 저장되어있음
					// nextLine()오류 뜨는 이유? 이전에 1입력후 엔터키(공백문자)가 처리되지 않아서
				}else {	// menu==2
					System.out.print("추가할 노래 입력 : ");
					sc.nextLine();
					String music = sc.nextLine();
					System.out.print("추가할 위치 입력 : ");
					int index = sc.nextInt();
					musicList.add(index-1,music);
				}
				System.out.println("추가가 완료되었습니다.");
				
			}else if(menu==2) {
				printList(musicList);
				System.out.print("[1]선택 삭제 [2]전체 삭제 >> ");
				menu = sc.nextInt();
				if(menu==1) {
					System.out.print("삭제할 노래 선택 >> ");
					musicList.remove(sc.nextInt()-1); // 입력받아서 반환까지 함
					System.out.println("노래가 삭제되었습니다.");
				}else {	// menu==2
					musicList.clear();
					System.out.println("전체 list가 삭제되었습니다.");
				}
			}else {	// menu==3
				System.out.println("프로그램 종료");
				break;
			}
		}
	}	// main 끝
	
	// 출력만 할거니까 void
	public static void printList(ArrayList<String> musicList) {	
		// main에서 사용할 new ArrayList을 여기서 생성x->다른리스트임 ()안에 정의
		System.out.println("=== 현재 재생 목록 ===");
		if(musicList.size()==0) {
			System.out.println("재생목록이 없습니다.");
		}else {
			for(int i=0;i<musicList.size();i++) {
				System.out.printf("%d. %s\n",i+1,musicList.get(i));
			}
		}
		System.out.println("==================");

	}
}
