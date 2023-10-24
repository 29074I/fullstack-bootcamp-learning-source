package weq;

public class Product {
	// 필드
	private String name;
	private int unitPrice;
	private int amount;
	
	// 생성자
	// 1) 생성자도 메서드다
	// 2) 생성자 이름이 클래스명과 같다(소/대문자)
	// 3) 생성자는 리턴타입이 없다 (void x)
	// 4) 기본생성자는 생략되어있다
	// ---> 새로운 생성자를 만들게 되면 기본생성자는 기능을 잃는다
	// ---> 기본생성자도 사용하고 싶으면 코드로 작성해줘야한다(생략 불가능)
	public Product(String name, int unitPrice, int amount) {
		this.name=name;
		this.unitPrice=unitPrice;
		this.amount=amount;
	}
	
	// 메서드
	public String getName(String name) {
		return name;
	}
	
	public int getUnitPrice(int unitPrice) {
		return unitPrice;
	}
	
	public int getAmount(int amount) {
		return amount;
	}
	
	
	
	
	
	
	
	
}
