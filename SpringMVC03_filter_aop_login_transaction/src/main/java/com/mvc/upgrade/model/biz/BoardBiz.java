package com.mvc.upgrade.model.biz;

import java.util.List;

import com.mvc.upgrade.model.vo.BoardVo;

public interface BoardBiz {
	public List<BoardVo> selectList();
	public BoardVo selectOne(int myno);
	public int insert(BoardVo vo);
	public int update(BoardVo vo);
	public int delete(int myno);
	public String test();
}






