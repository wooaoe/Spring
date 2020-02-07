package com.mvc.upgrade.model.dao;

import com.mvc.upgrade.model.vo.MemberVo;

public interface MemberDao {
	String NAMESPACE = "mymember.";
	
	public MemberVo login(MemberVo vo);
	
	
	
}







