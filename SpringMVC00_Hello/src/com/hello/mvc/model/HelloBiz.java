package com.hello.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //autowired를 통해 controller의 biz에 자동으로 의존성 주입됨? 
public class HelloBiz {
	
	@Autowired
	private HelloDao dao;
	
	public String getHello() {
		
		return dao.getHello() + "Spring";
	}
	
	
	
	
}
