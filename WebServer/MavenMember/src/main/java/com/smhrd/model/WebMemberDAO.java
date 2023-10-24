package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

//MyBatis DAO 정의
public class WebMemberDAO {

	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	// 회원가입
	public int join(WebMember member) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		int cnt = 0;
		try {
			cnt = sqlSession.insert("WebMemberDAO.insert",member);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close(); // 자원 반환			
		}
		return cnt;
	}
	
	// 로그인
	public WebMember login(WebMember member) {
		WebMember member2 = null;
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			member2 = sqlSession.selectOne("WebMemberDAO.login",member); // mapper "namespace.id"
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return member2;
	}
	
	public int update(WebMember member) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		int cnt = 0;
		try {
			cnt = sqlSession.update("WebMemberDAO.update",member);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close(); // 자원 반환			
		}
		return cnt;
	}
	
	public List<WebMember> select(){
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		List<WebMember> list = null;
		try {						// namespace.id
			list = sqlSession.selectList("WebMemberDAO.select"); // 넘겨줘야하는 값이 없으면 매개인자 1개만!
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}
	
	public int delete(String email) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		int cnt = 0;
		try {
			// ** 반환할 변수에 값을 꼭 넣어주기 
			cnt = sqlSession.delete("WebMemberDAO.delete",email);			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return cnt;
	}
	
	
}
