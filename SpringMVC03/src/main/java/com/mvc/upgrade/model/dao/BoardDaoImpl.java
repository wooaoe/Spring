package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.vo.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardVo> selectList() {

		List<BoardVo> list = new ArrayList<BoardVo>();

		try {
			list = sqlSession.selectList(NAMESPACE + "selectList");
		} catch (Exception e) {
			System.out.println("error! : select List");
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public BoardVo selectOne(int myno) {

		BoardVo vo = null;

		try {
			vo = sqlSession.selectOne(NAMESPACE + "selectOne", myno);
		} catch (Exception e) {
			System.out.println("error! : SELECT ONE");
			e.printStackTrace();
		}

		return vo;
	}

	@Override
	public int insert(BoardVo vo) {

		int res = 0;

		try {

			res = sqlSession.insert(NAMESPACE + "insert", vo);

		} catch (Exception e) {
			System.out.println("error! : INSERT");
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public int update(BoardVo vo) {
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}

}
