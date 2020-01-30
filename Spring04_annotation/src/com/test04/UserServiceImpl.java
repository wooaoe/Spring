package com.test04;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

// myUser01 bean을 주입 
	
//	@Resource(name="myUser01")
	@Autowired
	@Qualifier("myUser01")
	private UserVo vo;
	
	@Override
	public void addUser() {
		System.out.println("추가된 멤버 : " + vo.getUsername());
	}

}
