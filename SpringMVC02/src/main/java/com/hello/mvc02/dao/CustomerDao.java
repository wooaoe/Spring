package com.hello.mvc02.dao;

import java.util.List;

import com.hello.mvc02.vo.CustomerVo;

public interface CustomerDao {
	
	String namespace = "customer.";
	
	public List<CustomerVo> selectList();
	
}
