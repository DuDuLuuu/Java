package com.JDb.design.proxy;

public class Proxy extends Subject {
	private RealSubject realSubject;
	public void doSomething() {
		if(realSubject==null) {
			realSubject=new RealSubject();
		}
		realSubject.doSomething();
		
	}
}
