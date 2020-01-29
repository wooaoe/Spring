package com.test05;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "dept=" + dept + ", emp:" + emp;
	}

}
