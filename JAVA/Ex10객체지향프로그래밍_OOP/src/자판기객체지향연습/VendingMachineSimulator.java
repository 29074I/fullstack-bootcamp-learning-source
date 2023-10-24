package 자판기객체지향연습;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
	      // 자판기 프로그램을 만들어보자.
		
		VendingMachine vm = new VendingMachine();	// 변수 선언, 자판기 설치
		
		vm.inputMoney();	// 자판기에게 돈을 넣겠다라고 요청
		
		vm.menuChoice();	
		
		vm.changeMoney();	

	      
	      

	}

}
