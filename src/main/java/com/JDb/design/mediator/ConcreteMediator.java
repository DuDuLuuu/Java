package com.JDb.design.mediator;

public class ConcreteMediator extends Mediator {

	 ConcreteColleague1 c1;
	 ConcreteColleague2 c2;


	public ConcreteColleague1 getC1() {
		return c1;
	}


	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}


	public ConcreteColleague2 getC2() {
		return c2;
	}


	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}


	@Override
	void SendMessage(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if (colleague == c1) {
			c2.Notidy(message);
		} else {
			c1.Notidy(message);
		}
	}

}
