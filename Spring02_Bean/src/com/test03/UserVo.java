package com.test03;

import java.util.Date;
import java.util.Properties;

public class UserVo {

	private String userName;
	private Properties per;
	private Date myDate;

	public UserVo() {
		super();
	}

	public UserVo(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Properties getPer() {
		return per;
	}

	public void setPer(Properties per) {
		this.per = per;
	}

	public Date getMyDate() {
		return myDate;
	}

	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}

	@Override
	public String toString() {
		return "UserVo [userName=" + userName + ", per=" + per + ", myDate=" + myDate + "]";
	}

}
