package com.mvc.upgrade.model.dao;

import java.util.List;

import com.mvc.upgrade.model.vo.BoardVo;

public interface BoardDao {

	String NAMESPACE = "myboard.";
	
	public List<BoardVo> selectList();
	public BoardVo selectOne(int myno);
	public int insert(BoardVo vo);
	public int update(BoardVo vo);
	public int delete(int myno);
	
	
	
}
