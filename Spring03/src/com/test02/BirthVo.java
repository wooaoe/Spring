package com.test02;

public class BirthVo {

	private String name;
	private String birth;

	public BirthVo() {
		super();
	}

	public BirthVo(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "BirthVo [name=" + name + ", birth=" + birth + "]";
	}

}
