package com.JDb.design.decorator;
//装饰类
public class Decorator extends Person {
	protected Person person;
	public void Decorator(Person person) {
		this.person=person;
	}
	public void show() {
		if(person!=null)
		{
			person.show();
		}
	}
}
