package com.hello.mvc02.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mvc02.dao.CustomerDao;
import com.hello.mvc02.vo.CustomerVo;

@Service
public class CustomerBizImpl implements CustomerBiz{
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<CustomerVo> selectList() {
		
		return customerDao.selectList();
	}
	
	
	
}
