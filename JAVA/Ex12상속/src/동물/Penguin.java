package 동물;

public abstract class Penguin extends Bird{

	// 마우스 우클릭 -> Source -> Override/Implements Methods  클릭
	@Override
	public void move() {
		System.out.println("헤엄친다");
	}

}
