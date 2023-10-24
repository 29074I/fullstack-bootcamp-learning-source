package 물품관리프로그램_;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> al = new ArrayList<Product>();
		
		while(true) {
			System.out.print("[1]물건 추가 [2] 예상 판매량 조회 [3]종료 >> ");
			int choice = sc.nextInt();
			
			if(choice==1) {
				// 물건 추가
				System.out.print("물건 이름 : ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("단가 : ");
				int price = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				Product p = new Product(name, price, amount);
				al.add(p);
				
			}else if(choice==2) {
				// 예상 판매량 조회
				System.out.println("제품평\t단가\t수량");
				for(int i=0; i<al.size();i++) {
					System.out.printf("%s\t%s\t%s개\n",al.get(i).getName(),al.get(i).getUnitPrice(),al.get(i).getAmount());
				}
				int sum=0;
				for(int i=0;i<al.size();i++) {
					sum+= al.get(i).getUnitPrice()*al.get(i).getAmount();
				}
				System.out.printf("판매 시 매출 : %d원\n",sum);
			}else {
				// 종료
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
