package com.JDb.design.observer;

public class test {
	public static void main(String[] args) {
		//观察者模式
		ConcreteSubject concreteSubject=new ConcreteSubject();
		concreteSubject.setSubjectState("新状态");
		concreteSubject.Attach(new ConcreteObserver(concreteSubject, "X"));
		concreteSubject.Attach(new ConcreteObserver(concreteSubject, "Y"));
		concreteSubject.Notify();
		
	}
}
