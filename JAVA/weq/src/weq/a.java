package weq;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		
		// 설계도를 사용하려면 main()안에서 작성해야 한다
		// Product : 사용자 정의 자료형
		Scanner sc = new Scanner(System.in);
		System pp = new System();
		
		int choice;
		while(true) {
			System.out.println();
			System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
			choice = sc.nextInt();
			if(choice==1) {
				System.out.print("물건 이름 : ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("단가 : ");
				int price = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				pp.addProduct(name,price,amount);
				
			}else if (choice==2) {
			String k = pp.getProductList();
			System.out.println(k);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
		
	}
}
