import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	
	// DAO : Data Access Object
	// 데이터에 접근하는 기능을 가지고 있다!
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;	// 데이터 받는 객체
	
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";
			
			conn = DriverManager.getConnection(url,id,pw);	// 접속 성공

		} catch (ClassNotFoundException | SQLException e) {	// 접속 실패
			e.printStackTrace();
		}

	}
	
	public void close() {
		try {
			if(rs!=null) {
			rs.close();
		}if(pstm!=null) {
			pstm.close();
		}if(conn!=null) {
			conn.close();
		}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 로그인
	public String login(String inputId, String inputPw) { //매개변수를 지정
		getConn();
		String nick = null;
		try {
			String sql = "select nick from member where id = ? and pw = ?";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, inputId);
			pstm.setString(2, inputPw);
			
			rs = pstm.executeQuery();	// 데이터 조회 시
			
			if(rs.next()) {
				 nick = rs.getString("nick");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return nick;
	}
	
	// 회원가입 join으로 만들기
	public int join(String inputId, String inputPw, String inputNick) {
		getConn();
		int result = 0;

		try {
			String sql = "insert into member values(?,?,?)";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, inputId);
			pstm.setString(2, inputPw);
			pstm.setString(3, inputNick);
			
			result = pstm.executeUpdate();	// 데이터 변경 시			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return result;
	}
	
	// 전체 회원 조회
	public ArrayList<UserDTO> userList() {
		getConn();
		ArrayList<UserDTO> userList = new ArrayList<UserDTO>();
		try {
			String sql = "select * from member";
			pstm=conn.prepareStatement(sql); // 자바의 쿼리문을 sql 쿼리문으로 
			rs = pstm.executeQuery();
			while(rs.next()) {	// 다음 행을 가리킴
				String id = rs.getString(1);	// ("id")
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				
				UserDTO dto = new UserDTO(id, pw, nick);
				userList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return userList;
	}
	
}
