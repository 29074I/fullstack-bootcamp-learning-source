package 동물;

public class Main {

	public static void main(String[] args) {
		
		//Animal a1 = new Animal();
		// 추상 클래슨느 객체 생성이 불가능하다.
		// 추상화된 개념은 실물로 만드는게 불가능하다
		
		/*
		a1.eat();
		a1.sleep();
		a1.move();	// 네발로 기어다닌다.
		*/
		
//		Bird b1 = new Bird();
//		b1.eat();
//		b1.sleep();
//		b1.move();	// 날개로 날아다닌다 Bird에서 오버라이딩된 메서드
//
//		Sparrow b2 = new Sparrow();
//		b2.cry();
//		b2.eat();
//		b2.sleep();
//		b2.move();
//		
//		Penguin b3 = new Penguin();
//		b3.move();
		
		
		
		// - 형변환(Casting)
		// - 기본 데이터 타입에 대한 형변환 : 데이터의 크기를 변환하는 기능
		// - 객체의 타입에 대한 형변환 : 객체의 타입 변환
		// : 객체 타입에 대하여 형변환을 진행할 때는 꼭 ! 상속에 대한 개념이 포함
		
		// 명시적 vs 묵시적
		// 업캐스팅 vs 다운캐스팅
		
		// 묵시적(자동)형변환 :  (업캐스팅 개념)
		// : 자식 클래스가 부모 클래스의 타입으로 형태가 변형되는 것
		// ex) 참새(cham)은 동물(Animal)이다
		// 		펭귄은 동물이다
//		Animal a2 = new Penguin();
//		Animal a3 = new Sparrow();
		
		// 동물은 참새이다?
		// 동물은 펭귄이다?
		// 다운캐스팅 : 부----> 자식
		// Sparrow c2 = (Sparrow)new Animal();
		// 업캐스팅된 객체만 다운캐스팅 할 수 있다
//		Penguin p3 = (Penguin)a2;
		
		// 업캐스팅 (자동형변환)
		// 자식클래스를 부모클래스 자료형으로 변환
		// 다운캐스팅 (명시적형변환)
		// : 업캐스팅된 객체가 원래의 객체타입으로 돌아가는 것
		
		
		
		
		
		
		
		
		
	
	}

}
