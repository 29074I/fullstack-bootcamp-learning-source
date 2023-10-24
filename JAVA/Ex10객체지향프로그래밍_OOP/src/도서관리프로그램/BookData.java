package 도서관리프로그램;

// 책을 표현하는 클래스 (책 정보를 가지고 있음)
public class BookData {
	// 필드
	private String title;
	private int price;
	private String writer;
	
	// 생성자
	// 오른쪽 마우스 -> source -> generate constructor using fields
	public BookData(String title,int price, 
						String writer) {
		this.title=title;
		this.price=price;
		this.writer=writer;
	}

	// getter 메소드
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getWriter() {
		return writer;
	}
	
	
	
	
}
