import java.util.Scanner;

public class Ex04while {

	public static void main(String[] args) {
		// in  -> console에 입력, out ->  cosole에 출력
		
		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		 // 2. 현재 몸무게 : --> 출력문
		 // 오른쪽에 입력받기
		 System.out.print("현재 몸무게 : ");
	      int cnt = sc.nextInt();
	      // 3. 목표 몸무게 입력 받기
	      System.out.print("목표 몸무게 : ");
	      int goal = sc.nextInt();

//	      int week = 1;
//	      int weightLoss = 0;

	      // 4. 출력문 
	      // 4번은 반복이 된다 ----> 목표몸무게에 도달할 때까지 반복
//	      while (cnt-weightLoss > goal) {
//	         System.out.printf("%d주차 감량 몸무게 : ", week++);
//	         weightLoss += sc.nextInt();
//	      }
//	      System.out.printf("최종몸무게 : %d\n", cnt-weightLoss);
//	      System.out.println("축하합니다!!!");

	      int week = 1;
	      
	      while(true) {
	    	  System.out.print(week+"주차 감량 몸무게 : ");
	    	  int minus = sc.nextInt();
	    	  week++;
	    	  //현재 몸무게 = 현재 몸무게 - 감량 몸무게
	    	  cnt -= minus; // cnt = cnt - minus
	    	  // 종료조건
	    	  // : now가 목표몸무게에 도달했는지 (작거나 같은지) : while문을 종료
	    	  if(cnt <= goal) {
	    		  break;
	    	  }
	    // 5. 출력문
	      } System.out.println(cnt+"kg 달성 !! 축하합니다!!");
		
	}
	

	}

