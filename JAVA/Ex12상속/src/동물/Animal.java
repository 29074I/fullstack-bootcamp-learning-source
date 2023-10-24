package 동물;

public abstract class Animal {

	// 추상 키워드 : abstract
	// 추상 메서드를 포함하려면 추상 클래스로 바뀌어야 함
	// 추상 메서드를 포함하고 있지 않아도 추상 클래스가 될 수 있음
	// + 추상메서드는 설계만 되어 있다. (선언만되어있다)
	// + {body}가 없는 메서드를 보고 추상메서드라고 함
	
	// 동물 Class
	// 먹고 eat()
	public abstract void eat();	// 추상메서드
	
	// 자고 sleep()
	public abstract void sleep();
	
	// 움직 move()
	public abstract void move();
	
	
}
