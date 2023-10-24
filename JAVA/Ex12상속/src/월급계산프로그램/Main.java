package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee r = new RegularEmployee("SMHRD001","홍길동",4000,400);
		System.out.println(r.print());
		System.out.println(r.getMoneyPay());
		
		TempEmployee t = new TempEmployee("SMHRD002","박문수",3000);
		System.out.println(t.print());
		System.out.println(t.getMoneyPay());
		
		PartTimeEmployee p = new PartTimeEmployee("SMHRD001","홍길동",10,10);
		System.out.println(p.print());
		System.out.println(p.getMoneyPay());


		
		
	}

}
