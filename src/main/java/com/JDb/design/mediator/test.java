package com.JDb.design.mediator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//中介者模式
		ConcreteMediator mediator=new ConcreteMediator();
		ConcreteColleague1 c1=new ConcreteColleague1(mediator);
		ConcreteColleague2 c2=new ConcreteColleague2(mediator);
		mediator.setC1(c1);
		mediator.setC2(c2);
		c1.Send("hhh");
		c2.Send("洒瓜");
	}

}
