package 주소록관리프로그램;

public class Address {
	
	// 설계도 : 실행 x
	// 필드
	private String name;
	private int age;
	private String phoneNumber;
	
	// 생성자
	public Address(String name, int age, String phoneNumber) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
