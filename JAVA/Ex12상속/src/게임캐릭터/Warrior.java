package 게임캐릭터;

public class Warrior extends Charac {

	// 전진, 점프, 공격 -----> Charac
	
	@Override
	public void run() {
		System.out.println("뚜벅뚜벅");
		
	}

	@Override
	public void jump() {
		System.out.println("호잇쨔 점프");
		
	}

	@Override
	public void atk() {
		System.out.println("스윽.../");
		
	}
	
	
}
