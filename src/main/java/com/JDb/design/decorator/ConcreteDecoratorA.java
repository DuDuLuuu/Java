package com.JDb.design.decorator;
//具体装饰A
public class ConcreteDecoratorA extends Decorator {
	public void show() {
		System.out.println("具体装饰A");
		super.show();
	}
}
