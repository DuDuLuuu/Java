package com.JDb.design.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	public void Send(String message) {
		mediator.SendMessage(message, this);
	}
	public void Notidy(String message) {
		System.out.println("1号收到消息："+message);
	}

}
