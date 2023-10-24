package 돼지저금통프로그램;

public class PiggyBank2 {
	// 필드
	int money;
	
	// 메소드
	public void deposit(int inputMoney) { 
		money += inputMoney;
	}
	
	public void withdraw(int outputMoney) {
		if(money >= outputMoney) {
			money -= outputMoney;
		}
	}
	
	public int showMoney() {	
		return money;
	}
}
