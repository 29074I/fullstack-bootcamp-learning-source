package 월급계산프로그램;

public class PartTimeEmployee extends Employee {
	int workDay;
	
	// 생성자
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);	// -> 부모 클래스의 생성자를 지칭하는 키워드
		this.workDay = workDay;
	}


	@Override
	public int getMoneyPay() {
		return pay*workDay;
	}


//	@Override
//	public String print() {
//		return empno+" :"+name+" : "+pay;
//	}

}
