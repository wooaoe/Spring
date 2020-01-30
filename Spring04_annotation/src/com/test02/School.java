package com.test02;

import javax.annotation.Resource;

public class School {

	@Resource(name="mystu1") //Autowired와 동일하게 데이터를 주입시키는 annotation
	private Student person;
	
	private int grade;

	public School() {
		super();
	}

	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}

	public Student getPerson() {
		return person;
	}

	public void setPerson(Student person) {
		this.person = person;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "person=" + person + ", grade=" + grade;
	}

}
