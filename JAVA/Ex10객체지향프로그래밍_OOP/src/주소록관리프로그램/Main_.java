package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_ {

	public static void main(String[] args) {
		
		// 설계도를 사용하는 공간
		Scanner sc = new Scanner(System.in);
		// Address자료형(클래스)를 관리하는 ArrayList룰 생성
		ArrayList<Address_> addr = new ArrayList<Address_>();
		
		while(true) {
			System.out.println("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int select = sc.nextInt();
			
			if(select==1) {
				// 추가
				// 이름, 나이, 전화번호 --> Address_() --> add
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
				Address_ a = new Address_(name, age, phoneNumber);
				addr.add(a);
				
			}else if(select==2) {
				// 전체조회
				if(addr.size()==0) {
					System.out.println("등록된 연락처가 없습니다.");
				}
				for(int i =0; i<addr.size();i++) {
					System.out.println(i+1 +". ");	// 1.
					System.out.println(addr.get(i).getNmae()+"("+addr.get(i).getAge()+"세) : ");
					System.out.println(addr.get(i).getPhoneNumber());
					System.out.println();
					
					
				}
			}else if(select==3) {
				// 삭제
				if(addr.size()==0) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
				System.out.println("삭제할 번호 입력 : ");
				int num = sc.nextInt();
				// 실제 삭제할 데이터의 위치(인덱스값) == 사용자가입력한값 - -1
				addr.remove(num);
				}
			}else if(select==4) {
				// 검색
				System.out.print("검색할 이름 입력 : ");
				String name = sc.next();
				
				// 검색하고자 하는 데이터의 위치를 저장하는 변수
				int index = -1;
				
				// addr.get(i).getName() == name
				// addr에 사용자가 입력한 name이 있는지 없는지 판단
				for(int i=0;i<addr.size();i++) {
					if(name.equals(addr.get(i).getNmae())) {
						index = i;
					}
				}
				
				// index라는 변수에 어떤값이 들어있는지 판단
				if(index == -1) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}else {
					System.out.println(index+1 +". ");	// 1.
					System.out.println(addr.get(index).getNmae()+"("+addr.get(index).getAge()+"("+"세) : ");
					System.out.println(addr.get(index).getPhoneNumber());
					System.out.println();
				}
				
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
	}

}
