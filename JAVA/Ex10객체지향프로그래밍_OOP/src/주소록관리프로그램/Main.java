package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 설계도를 사용하는 공간

		Scanner sc = new Scanner(System.in);

		ArrayList<Address> ad = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 추가
				System.out.print("이름 : ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				sc.nextLine();
				String num = sc.nextLine();
				Address a = new Address(name, age, num);
				ad.add(a);
			} else if (choice == 2) {
				// 전체 조회
				if (ad.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					for (int i = 0; i < ad.size(); i++) {
						System.out.printf("%d. %s(%d세) : %s\n", i + 1, ad.get(i).getName(), ad.get(i).getAge(),
								ad.get(i).getPhoneNumber());
					}
				}
			} else if (choice == 3) {
				// 삭제
				if (ad.size() == 0) {
					System.out.println("등록된 연락처가 없습니다");
				} else {
					System.out.print("삭제할 번호 입력 : ");
					ad.remove(sc.nextInt() - 1);
				}

			} else if (choice == 4) {
				// 검색
				System.out.print("검색할 이름 입력 : ");
				sc.nextLine();
				String inN = sc.nextLine();
				boolean sw = false;

				for (Address a1 : ad) {
					if (a1.getName().equals(inN)) {
						for(int i=0; i<ad.size();i++) {
							System.out.printf("%d. %s(%d세) : %s\n", i+1,a1.getName(),a1.getAge(),a1.getPhoneNumber());
							sw = true;
						}
						}
						if(!sw) {
							System.out.println("검색정보없음");
					
						
						
						
				}
				}

			} else {
				// 종료
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
	