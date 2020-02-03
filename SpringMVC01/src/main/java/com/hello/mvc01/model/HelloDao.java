package com.hello.mvc01.model;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {

	public String getHello() {

		return "Hello, ";
	}

}
