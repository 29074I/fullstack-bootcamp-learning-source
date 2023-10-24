import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	//DAO : Data Access Object
	//데이터에 접근하는 기능을 가지고 있다!
	
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	public void getConn() {
		try {
			//DB연결할 수 있는 외부 클래스 가져오기!
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id ="service";
			String pw ="12345";
			
			//DriverManager --> DB랑 연결
			//--> JAVA,DB 통로 만들어준다!
			conn = DriverManager.getConnection(url, id, pw);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void close() {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstm != null) {
				pstm.close();
			}
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//로그인
	public String login(String inputId, String inputPw) {
		getConn();
		String nick = null;
		try {
			String sql = "select nick from member where id = ? and pw = ?";
			
			pstm=conn.prepareStatement(sql);
			pstm.setString(1,inputId);
			pstm.setString(2,inputPw);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				nick = rs.getString("nick");
			}	
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return nick;
	}
	
	//회원가입 join으로 만들어 주세요!
	public int join(String inputId, String inputPw, String inputNick) {
		
		getConn();
		int result = 0;
		try {
			String sql = "insert into member values(?,?,?)";
			
			pstm=conn.prepareStatement(sql);
			pstm.setString(1,inputId);
			pstm.setString(2,inputPw);
			pstm.setString(3, inputNick);
			
			result = pstm.executeUpdate();
				
			
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		
		close();
		return result;
	}
	
	public ArrayList<UserDTO> userList() {
		getConn();
		ArrayList<UserDTO> userList = new ArrayList<UserDTO>();
		
		try {
			String sql = "select * from member";
			pstm = conn.prepareStatement(sql);
			rs =pstm.executeQuery();
			
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				
				UserDTO dto = new UserDTO(id, pw, nick);
				userList.add(dto);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close();
		return userList;		
	}
	
	public int deleteUser(String inputId) {
		getConn();
		int result  = 0;
		
		try {
			String sql = "delete from member where id =?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputId);
			result =pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return result;
		
	}
	
	public int updateUser(String inputId, String inputNick) {
		getConn();
		int result  = 0;
		
		try {
			String sql = "update member set nick = ? where id = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputNick);
			pstm.setString(2, inputId);
			result =pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
