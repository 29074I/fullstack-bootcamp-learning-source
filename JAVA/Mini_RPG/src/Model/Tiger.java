package Model;

public class Tiger extends Monster {

	public Tiger(int hp, int op, int dp) {
		super(hp, op, dp);
	}

	@Override
	public void attack() {
		System.out.println("호랑이 공격");
		
	}

	@Override
	public void printInfo() {
		System.out.println("호랑이 정보");
		
	}

}
