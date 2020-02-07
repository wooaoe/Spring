package com.mvc.upgrade.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.vo.MemberVo;


@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public MemberVo login(MemberVo vo) {
		MemberVo res = null;
		System.out.println(vo.getMemberid());
		System.out.println(vo.getMemberpw());
		
		try {
			res = sqlSession.selectOne(NAMESPACE+"login",vo);
		}catch (Exception e) {
			System.out.println("[error] : LOGIN");
			e.printStackTrace();
		}
		return res;
	}

}











