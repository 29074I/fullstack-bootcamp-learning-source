package Model;

public class BowVO extends ItemVO {
	private int durability; // 새로 만들면 getter setter 꼭 가져와라

	public BowVO(int itenNum, String name, int attackPower, int durability) {
		super(itenNum, name, attackPower);
		this.durability = durability;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	
}
