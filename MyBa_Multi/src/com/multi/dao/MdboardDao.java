package com.multi.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.multi.vo.MdboardVo;

public class MdboardDao extends SqlMapConfig {

	private String namespace = "com.multi.";

	public List<MdboardVo> selectAll() {

		SqlSession session = null;
		List<MdboardVo> res = null;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectList(namespace + "selectAll"); // com.multi.selectAll Äõ¸® ½ÇÇà
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;

	}

	public MdboardVo selectOne(int seq) {

		SqlSession session = null;
		MdboardVo res = null;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectOne(namespace + "selectOne", seq);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;
	}

	public int insert(MdboardVo vo) {

		SqlSession session = null;
		int res = 0;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.insert(namespace + "insert", vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;
	}

	public int update(MdboardVo vo) {

		SqlSession session = null;
		int res = 0;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.insert(namespace + "update", vo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;
	}

	public int delete(int seq) {

		SqlSession session = null;
		int res = 0;

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.insert(namespace + "delete", seq);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return res;
	}

}
