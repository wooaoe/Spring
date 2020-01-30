package com.test01.anno;

import org.springframework.stereotype.Component;

@Component // 해당하는 클래스가 bean으로 생성됨
public class NickName {

	public NickName() {
		super();
	}

	@Override
	public String toString() {
		return "nickname : 멍멍이";
	}

}
