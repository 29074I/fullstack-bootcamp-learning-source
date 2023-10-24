package 도서관리프로그램;

import java.util.Scanner;

// 사용자와 상호소통하는 인터페이스 역할 (결과출력, 입력 등)
public class BookDataSimulator {

	public static void main(String[] args) {
		// 생성자를 호출 -> new BookData
		//BookData book1 = new BookData("책이름",10000,"책저자");
		
		System.out.println("===도서관리 시스템===");
		Scanner sc = new Scanner(System.in);
		BookSystem bookManager = new BookSystem();
		
		while(true) {
			System.out.println("[1]등록 [2]전체조회 [3]종료");
			int choice = sc.nextInt();
			
			
			if(choice==1) {
				System.out.print("책 이름 :");
				String title = sc.next();
				System.out.print("책 가격 : ");
				int pricate = sc.nextInt();
				System.out.print("책 저자 : ");
				String writer = sc.next();
				bookManager.addBook(title, pricate, writer);
				
			}else if (choice==2) {
				String msg = bookManager.getBookTitleList();
				System.out.println(msg);
			}else if(choice==3) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else {
				System.out.println("올바른 숫자를 입력하세요.");
			}
			
		}

		
	}

}
