package 성적관리프로그램;

public class Student {
	// 필드
	// private -> 이 클래스 내에서만 접근 가능
	private String stuName;
	private String stuNum;
	private int javaScore;
	private int dbScore;
	private int webScore;
	
	// 생성자
	// 객체를 생성할 때 최초로 1번만 호출되는 메소드 
	// 반환타입을 작성하지 않는다 -> void도 x
	// 클래스이름과 생성자이름이 동일
	// 생성자는 하나 이상 선언되어야 한다
	// -> 없는 경우 컴파일 시에 자동으로 default생성자 추가
	// 필드와 지역변수 각 다른영역에 저장되었기에 같은이름의 변수 생성이 가능
	// 필드와 지역변수를 구분해줄 수 있는 키워드 -> this.
	public Student(String stuName, // 지역변수 -> stack에 할당됨
			String stuNum, int javaScore,
			int dbScore, int webScore) {
		this.stuName = stuName;
		this.stuNum = stuNum;
		
		this.javaScore = validScore(javaScore);
		this.dbScore = validScore(dbScore);
		this.webScore = validScore(webScore);
	}
	
	// 메소드
	private int validScore(int score) {
		if(score >= 0 || score <= 100) {
			return score;
		}else {
			return 0;
		}
	}
	
	// getter 메소드
	// 오른쪽마우스 -> Source -> Generate Getters and Setters
	public String getStuName() {
		return stuName;
	}
	public String getStuNum() {
		return stuNum;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public int getDbScore() {
		return dbScore;
	}

	public int getWebScore() {
		return webScore;
	}

	// setter 메소드 -> 값을 수정할 수 있음
	// 필드명이 붙음
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
	

	
	
	
	
}
