package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dao.BoardDaoImpl;
import com.mvc.upgrade.model.vo.BoardVo;

@Service
public class BoardBizImpl implements BoardBiz {
	@Autowired
	private BoardDao dao;

	@Override
	public List<BoardVo> selectList() {
		return dao.selectList();
	}

	@Override
	public BoardVo selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardVo vo) {
		return dao.insert(vo);
	}

	@Override
	public int update(BoardVo vo) {
		return dao.update(vo);
	}

	@Override
	public int delete(int myno) {
		return dao.delete(myno);
	}
	
	@Transactional
	@Override
	public String test() {

		dao.insert(new BoardVo(0, "transaction", "test2", "insert", null));
		String test = dao.test();
		
		//insert 한 다음 예외 발생 시킴 
		//biz에서 transaction을 관리함(DB에 접근하는 것을 관리) 
		//null의 길이를 재려고하니까 nullpointer 
		test.length();

		return test;
	}

}
