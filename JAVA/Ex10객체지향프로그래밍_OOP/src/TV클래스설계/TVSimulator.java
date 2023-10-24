package TV클래스설계;

public class TVSimulator {

	public static void main(String[] args) {
		// TV 객체(object) 생성!!!!!!
		
		// 데이터타입 변수명 = new 데이터타입();
		// 기본타입, 레퍼런스타입(사용자정의)
		TV tv1 = new TV();
		TV tv2 = new TV();
		// 객체를 만들면 heap영역에 저장됨 -> main에 있는 tv1이 heap영역에 할당 -> tv 필드가 들어가있음
		// 스택영역에 메인만의 공간이 할당됨 네?이게무슨소릴까유
		// 메인안에 tv1이라는 공간이 만들어짐
		
		tv1.브랜드이름 = "삼성";
		tv2.브랜드이름 = "LG";
		
		tv1.채널변경하기(30);
		tv1.채널내리기();
		System.out.println(tv1.채널);
		
	}

}
