package com.test07;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Poo {

	Bar bar;

	public Poo() {

	}

	public Poo(Date date) {
		System.out.println("Poo(Date) 호출!");
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar()");
	}

	public void setDate(Date date) {
		System.out.println("setDate() 호출!" + date);
	}

	public void setNumber(int num) {
		System.out.println("setNumber() 호출!" + num);
	}

	public void setStudent(String[] item) {
		System.out.println("setStudent() 호출!");
		for (String name : item) {
			System.out.println("학생 : " + name);
		}
	}

	public void setInfo(List<String> item) {
		System.out.println("setInfo() 호출!");
		for (String res : item) {
			System.out.println(res);
		}
	}

	public void setSeason(Map<String, String> item) {
		System.out.println("setSeason() 호출");
		Set<String> keys = item.keySet();
		for (String key : keys) {
			System.out.println(key + "의 계절" + item.get(key));
		}
	}

	public void setScore(List<Score> student) {

		System.out.println("setScore() 호출");
		for (Score sc : student) {
			System.out.println(sc);
		}
	}

}
