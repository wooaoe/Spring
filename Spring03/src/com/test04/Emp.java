package com.test04;

public class Emp {

	private String name;
	private String salary;

	public Emp() {
	}

	public Emp(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary;
	}

}
