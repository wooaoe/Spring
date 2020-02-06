package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.vo.BoardVo;

@Service
public class BoardBizImpl implements BoardBiz{

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
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}

}
