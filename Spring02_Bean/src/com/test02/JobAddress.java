package com.test02;

public class JobAddress {

	private Address addr;
	private String jobname;

	public JobAddress() {
		this.addr = new Address("홍길동", "서울시 강남구", "010-1234-5678");
		this.jobname = "웹 개발자";
	}

	public JobAddress(Address addr, String jobname) {
		super();
		this.addr = addr;
		this.jobname = jobname;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	@Override
	public String toString() {
		return "JobAddress [addr=" + addr + ", jobname=" + jobname + "]";
	}

}
