package com.mvc.upgrade.model.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.MemberDao;
import com.mvc.upgrade.model.vo.MemberVo;


@Service
public class MemberBizImpl implements MemberBiz {
	@Autowired
	private MemberDao dao;
	
	@Override
	public MemberVo login(MemberVo vo) {
		return dao.login(vo);
	}

	
	
	
	
	
	
	
	
}




