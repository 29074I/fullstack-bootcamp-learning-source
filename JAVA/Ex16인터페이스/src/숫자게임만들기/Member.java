package 숫자게임만들기;

public class Member {
	// 닉네임, 비밀번호

	private String nick;
	private String pw;

	// 생성자
	public Member(String nick, String pw) {
		this.nick = nick;
		this.pw = pw;
	}
	
	// getter / setter
	public String getNickName() {
		return nick;
	}

	public void setNickName(String nick) {
		this.nick = nick;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
