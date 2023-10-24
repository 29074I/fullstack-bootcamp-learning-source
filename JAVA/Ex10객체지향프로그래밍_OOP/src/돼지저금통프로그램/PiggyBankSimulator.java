package 돼지저금통프로그램;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		// 돼지 저금통 객체 생성
		PiggyBank p1 = new PiggyBank();
		
		// 입금기능 메소드 호출
		p1.deposit(1500);
		p1.deposit(700);
		
		// 출금기능 메소드 호출
		p1.withdraw(500);
		
		// 잔액확인 메소드 호출
		p1.showMoney();
	}

}
