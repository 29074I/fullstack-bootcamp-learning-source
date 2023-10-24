import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC회원가입 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("직원 이름 입력 >> ");
		String inputName = sc.next();
		System.out.print("비밀번호 입력 >> ");
		String inputPw = sc.next();
		System.out.print("성별 입력 >> ");
		String inputGender = sc.next();
		System.out.print("나이 입력 >> ");
		int inputAge = sc.nextInt();
		System.out.print("연봉 입력 >> ");
		int inputMoney = sc.nextInt();
		// JDBC 사용 순서
		// 1. DB 연결
		Connection conn = null;

		// 쿼리문을 실행시키는 객체
		// Java에서 문자열로 된 쿼리문을 Oracle의 쿼리문으로 바꿔서 실행시켜줌!
		PreparedStatement pstm = null;

		// 쿼리문을 통해서 발생한 응답을 담을 수 있는 객체
		ResultSet rs = null;

		try {
			// DB 연결할 수 있는 외부클래스 가져오기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오류 발생 시 경로 다시 확인
			// 폴더 확인

			// 프로젝트 우클릭 -> build path -> configure build path -> libraries ->
			// classpath -> add external JARs... ->(sqldeveloper->jdbc->ojdbc8선택)

			// 연결 시 필요한 값 (url, id, pw)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";

			// DriverManager --> DB랑 연결
			// --> Java, DB 통로를 만들어준다
			conn = DriverManager.getConnection(url, id, pw); // DB에 접속 시도
			System.out.println("접속 성공");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}

		// 2. 접속 후 실행하고 싶은 쿼리문 실행
		try {
			// 0. 나이가 40 이상인 직원의 이름만 출력 시켜주세요
			// (2) 위에서 입력받은 inputName, inputPw를 이용해서 해당하는 직원의 나이를 출력시켜 주세요		
			// 쿼리문에서 먼저 거르기.
//			String sql = "select 이름 from 직원 where 이름 ='"+inputName+"' and 비밀번호 = '"+inputPw+"'"; // 1. where 나이 >= 40
			// String sql = "select * from 직원 where 이름 = ? and 비밀번호 = ?";
			
			// (3)이름, 비밀번호, 성별, 나이, 연봉 입력 받아서 데이터를 추가 하고싶다
			String sql = "insert into 직원 values('A0011',?,?,?,?,null,'123-123',?,'D006')";
			// insert into 직원 values (직원id_seq.nextval,'1234','승환','남',20,null,'123-123',3000,'D006');
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, inputPw); 	// 지정해주겠다는 의미
			pstm.setString(2, inputName);
			pstm.setString(3, inputGender);
			pstm.setInt(4, inputAge);
			pstm.setInt(5, inputMoney);
			
			// rs = pstm.executeQuery(); // 직원 데이터가 담겨짐 -> select 같은 데이터 변경이 없을 때, 데이터 조회 시 사용
			
			// 변경된 행의 갯수를 반환.
			int result = pstm.executeUpdate();	 // -> insert, update, delete 같이 데이터 변경이 있을 때 사용 
			if(result>0) {
				System.out.println("회원가입 성공!");
			}
			
			

			// 맨 처음의 주소값을 가지고 있기 때문에 이 다음 주소값으로 변경시켜줘야 함
			// rs.next(0 -> 주소값을 바꿔서 데이터가 있는지 없는지 판단
			// -> boolean type
			
//			if(rs.next()) {
//				int age = rs.getInt("나이");
//				System.out.println("입력한 직원의 나이 >> "+ age);
//			}
			
//			while (rs.next()) { // '김철수'만 출력하려면 -> if(rs.next()){
//				if(rs.getString("이름").equals(inputName)&& rs.getString("비밀번호").equals(inputPw)) {
//					int age = rs.getInt("나이");
//					System.out.println("입력한 직원의 나이는 >> "+age);
//				}
//				String name = rs.getString(1);
//				if (rs.getInt(5) >= 40) { // 2. rs.getInt 사용 // 나이 인덱스 5번에 위치
//					// getString("이름") 이름 컬럼에서 문자열데이터(이름)을 가져오겠다
//					// getString(인덱스) DB에서 인덱스를 사용할 때는 1부터 적용됨
//					String name = rs.getString(3); // ("이름") -> 이름 인덱스 3번에 위치
//				System.out.println(name);
//				}

//			}
		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}

		// 3. DB 연결 제거 -> 역순으로!
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//  테이블 생성 alt + x
}
