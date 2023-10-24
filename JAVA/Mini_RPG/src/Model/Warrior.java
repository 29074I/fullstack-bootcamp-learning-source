package Model;

public class Warrior extends Charater implements Defensible {
	private SwordVO equipeedItem;

	public Warrior(int hp, int op, int dp) {
		super(hp, op, dp);
	}

	@Override
	public void defence() {
		System.out.println("전사 방어");
	}

	@Override
	public void itemUse(ItemVO item) {
		System.out.println("전사 아이템 사용!");	
		if(item instanceof SwordVO) {
			this.equipeedItem=(SwordVO)item; //(swordvo)->다운캐스팅
		}
	}

	@Override
	public void itemUnUse() {
		System.out.println("전사 아이템 해제!");
	}

	@Override
	public void attack() {
		System.out.println("전사 공격");
	}

	@Override
	public void printInfo() {
		System.out.println("전사 정보");	
	}

	
}
