package com.hello.mvc02.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.mvc02.vo.CustomerVo;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<CustomerVo> selectList() {

		List<CustomerVo> res = null;

		try {
			res = sqlSession.selectList(namespace + "selectList");
		} catch (Exception e) {
			System.out.println("selectList error");
			e.printStackTrace();
		}

		return res;
	}

}
