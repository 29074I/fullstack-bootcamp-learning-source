package Model;

public abstract class Charater extends Creature {

	public Charater(int hp, int op, int dp) {
		super(hp, op, dp);
	}
	
	// 바디 내용은 아래 본 클래스에서 작성(archer,warrior에서)
	public abstract void itemUse(ItemVO item);
	public abstract void itemUnUse();

}
