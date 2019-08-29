package com.JDb.design.observer;

public class ConcreteObserver extends Observer{
	private String name;
	private String subjectState;
	private ConcreteSubject concreteSubject;

	public ConcreteObserver(ConcreteSubject concreteSubject,String name) {
		this.name=name;
		this.concreteSubject=concreteSubject;
	}
	public void doUpdate() {
		// TODO Auto-generated method stub
		subjectState=concreteSubject.getSubjectState();
		System.out.println("观察者 "+name+" 的新状态是 "+subjectState);
	}
/*	public ConcreteSubject getConcreteSubject() {
		return concreteSubject;
	}
	public void setConcreteSubject(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
	}*/
	

}
