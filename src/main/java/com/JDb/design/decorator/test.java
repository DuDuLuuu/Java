package com.JDb.design.decorator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("bz");
		ConcreteDecoratorA concreteDecoratorA=new ConcreteDecoratorA();
		ConcreteDecoratorB concreteDecoratorB=new ConcreteDecoratorB();
		
		
		concreteDecoratorA.Decorator(person);
		concreteDecoratorB.Decorator(concreteDecoratorA);
		concreteDecoratorB.show();
	}

}
