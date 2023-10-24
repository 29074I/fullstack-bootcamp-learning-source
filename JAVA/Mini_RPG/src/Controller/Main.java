package Controller;

import java.util.Scanner;

import View.Main_display;

public class Main {

	public static void main(String[] args) {

//		Turtle gobuk = new Turtle(10, 1, 200);
//		gobuk.attack();
		Scanner sc = new Scanner(System.in);
		AllSelectItem allSelect = new AllSelectItem();
		Main_display dp = new Main_display();

		while (true) {
			dp.render();
			int menu = sc.nextInt();
			if(menu==1) {
				// 아이템 조회
				System.out.print("[1]전체아이템 조회 [2]검 아이템 조회 [3]활 아이템 조회 >> ");
				menu = sc.nextInt();
				allSelect.rangeAll(menu);
			}else if(menu==2) {
				// 캐릭터생성
			}else if(menu==3) {
				// 장비장착
			}else{
				// 종료
				System.out.println("종료");
				break;
			}
				
			
		}

	}

}
