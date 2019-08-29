package com.JDb.design.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	public void Send(String message) {
		mediator.SendMessage(message, this);
	}
	public void Notidy(String message) {
		System.out.println("2号收到消息："+message);
	}

}
