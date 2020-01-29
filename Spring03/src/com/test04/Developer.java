package com.test04;

public class Developer {

	private String dept;
	private Emp emp;

	public Developer() {
	}

	public Developer(String dept, Emp emp) {
		super();
		this.dept = dept;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return emp + "\t 부서 :" + dept + "(dev)";
	}

}
