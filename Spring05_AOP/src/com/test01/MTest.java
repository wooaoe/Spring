package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		Man m = new Man();
		Woman w = new Woman();
		
		System.out.println("학생 입장");
		w.classWork();
		System.out.println("----------");
		System.out.println("그 성별 입장");
		m.classWork();
	}

}
