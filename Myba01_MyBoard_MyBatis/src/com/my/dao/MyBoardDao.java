package com.my.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.my.vo.MyBoardVo;

public class MyBoardDao extends SqlMapConfig {

	private String namespace = "com.my.myboard.";

	public List<MyBoardVo> selectAll() {

		List<MyBoardVo> res = new ArrayList<>();

		SqlSession session = null;
		// SqlSession을 통해 쿼리 준비
		session = getSqlSessionFactory().openSession(true);
		// openSession(true) : true --> autoCommit; false --> not autoCommit
		res = session.selectList(namespace + "selectAll"); // --> com.my.myboard.selectAll

		session.close();

		return res;
	}

	public MyBoardVo selectOne(int myno) {

		SqlSession session = null;
		MyBoardVo res = null;

		session = getSqlSessionFactory().openSession(true);
		res = session.selectOne(namespace + "selectOne", myno);

		session.close();

		return res;

	}

	public int insert(MyBoardVo vo) {

		SqlSession session = null;
		int res = 0;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.insert(namespace + "myinsert", vo);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			session.close();
		}

		return res;

	}

	public int update(MyBoardVo vo) {

		SqlSession session = null;
		int res = 0;
		System.out.println("update의 vo: " + vo);
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.update(namespace + "myupdate", vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;
	}

	public int delete(int myno) {

		SqlSession session = null;
		int res = 0;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.update(namespace + "mydelete", myno);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;

	}

}
