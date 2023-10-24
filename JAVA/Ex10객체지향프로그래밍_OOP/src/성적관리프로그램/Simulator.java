package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {
		// stu1 객체 생성 -> 생성자를 호출한다는 의미
		Student stu1 = new Student("황해도","001",90,80,87); // stu1은 스택에 new Student()는 힙에
		// stu2 객체 생성
		Student stu2 = new Student("강예진","002",100,100,100);
		
//      직접 접근하는 건 권장x -> 데이터 보호가 안되기 때문에
//		stu1.stuName = "황해도";
//		stu1.stuNum = "001";
//		stu1.javaScore = 90;
//		stu1.dbScore = 80;
//		stu1.webScore = 87;
		
		System.out.println(stu1.getStuName());
		System.out.println(stu1.getStuNum());
		System.out.println(stu1.getJavaScore());
		
		// stu1 학번 수정
		stu1.setStuNum("002");
		System.out.println(stu1.getStuNum());
		
		
		
		
	}

}
