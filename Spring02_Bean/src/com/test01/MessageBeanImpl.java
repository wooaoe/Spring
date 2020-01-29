package com.test01;

public class MessageBeanImpl implements MessageBean {

	private String fruit;
	private int cost;
	

	public MessageBeanImpl() {
		this.fruit = "strawberry";
		this.cost = 10000;
	}

	public MessageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}

	@Override
	public void sayHello() {
		System.out.println("fruit : " + fruit + " 가격 = " + cost);
	}

}
