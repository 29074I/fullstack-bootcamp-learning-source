import java.util.ArrayList;
import java.util.Scanner;

public class Ex04MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> ml = new ArrayList<String>();

		int in;

		do {
			System.out.print("[1] 노래추가 [2]노래 삭제 [3] 노래종료 >>");
			in = sc.nextInt();

			switch (in) {
			case 1:
				System.out.println("========== 현재 재생 목록 ==========");
				if (ml.size() == 0) {
					System.out.println("재생 목록이 없습니다");
					System.out.println("================================");
				}
				if (ml.size() !=0) {
					for (int i = 0; i < ml.size(); i++) {
						System.out.printf("%d.%s\n", i + 1, ml.get(i));
					}
					System.out.println("=================================");
				}

				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				int in2 = sc.nextInt();
				if (in2 == 1) {
						System.out.print("추가 할 노래 입력 : ");
					String music = sc.next();
					ml.add(music);
					System.out.println("추가가 완료되었습니다.");
					break;
					
					
				}
				if (in2 == 2) {
					System.out.print("추가 할 노래 입력 : ");
					String music = sc.next();
					System.out.print("추가할 위치 입력 : ");
					int in3 = sc.nextInt();
					ml.add(in3-1, music);
					System.out.println("추가가 완료되었습니다.");
					break;
					
				}

			case 2:
					System.out.println("========== 현재 재생 목록 ==========");
					
					if (ml.size() == 0) {
						System.out.println("재생 목록이 없습니다");
						System.out.println("=================================");
					} 
					
					if(ml.size()!=0) {
						for (int i = 0; i < ml.size(); i++) {
							System.out.printf("%d.%s\n", i+1, ml.get(i));
						}
						System.out.println("=================================");
					}
						System.out.print("[1]선택삭제 [2]전체삭제 >>");
						int in3 = sc.nextInt();
						if (in3 == 1) {
							System.out.print("삭제할 노래 선택 >> ");
							int del = sc.nextInt();
							String a = ml.remove(del-1);
							System.out.println("노래가 삭제되었습니다.");
							break;
						}else {
							System.out.println("전체 list가 삭제되었습니다.");
							ml.clear(); 
							break;
						}
					}
		} while (in != 3);
		System.out.println("프로그램이 종료되었습니다.");

	}
}
