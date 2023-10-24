package Model;

public abstract class ItemVO {

	private int itenNum;
	private String name;
	private int attackPower;
	
	public ItemVO(int itenNum, String name, int attackPower) {
		// super();최상위이기때문에 필요x
		this.itenNum = itenNum;
		this.name = name;
		this.attackPower = attackPower;
	}

	public int getItenNum() {
		return itenNum;
	}

	public void setItenNum(int itenNum) {
		this.itenNum = itenNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	
}
