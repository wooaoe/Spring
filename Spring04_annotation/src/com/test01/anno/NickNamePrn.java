package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NickNamePrn {
	
	@Autowired //자동으로 의존성 주입 (scan을 하다가 해당 필드의 클래스 타입과 동일한 타입의 bean이 있다면 그 bean을 주입) 
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
