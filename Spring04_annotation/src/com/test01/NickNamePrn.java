package com.test01;

public class NickNamePrn {

	private NickName nickName;

	public NickNamePrn() {
		super();
	}

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "nickName=" + nickName;
	}

}
