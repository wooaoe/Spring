package com.test04;

public class Engineer {

	private String dept;
	private Emp emp;

	public Engineer() {

	}

	public Engineer(String dept, Emp emp) {
		super();
		this.dept = dept;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return emp + "\t 부서 :" + dept + "(Engineer)";
	}

}
