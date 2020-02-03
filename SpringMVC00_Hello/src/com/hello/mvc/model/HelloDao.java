package com.hello.mvc.model;

import org.springframework.stereotype.Repository;

@Repository //Dao라는 걸 명시해주는 annotation
public class HelloDao {

	public String getHello() {
		
		return "hello, ";
	}
	
	
	
}
