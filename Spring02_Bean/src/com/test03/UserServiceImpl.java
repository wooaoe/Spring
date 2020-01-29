package com.test03;

public class UserServiceImpl implements UserService{

	public UserServiceImpl() {
		
		System.out.println("UserServiceImpl 생성자!");
	
	}
	
	@Override
	public void addUser(UserVo vo) {
		
		System.out.println("addUser 메소드 호출");
		
	}

}
