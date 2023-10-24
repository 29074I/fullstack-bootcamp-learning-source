
public class UserDTO {
	
	// DTO -> Data Transfer Object 
	
	// MVC 패턴
	// M : Model(Value Object) -> 데이터가 보여지는 형식
	// V : View  -> 사용자에게 보여지는 전부분 
	// C : Controller -> 사용자에게 보여지지는 않지만 기능상의 데이터를 다루는 부분 dao
	
	private String id;
	private String pw;
	private String nick;
	private String anwer;
	// 생성자
	public UserDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNick() {
		return nick;
	}

	public String getAnwer() {
		return anwer;
	}

	public void setAnwer(String anwer) {
		this.anwer = anwer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
