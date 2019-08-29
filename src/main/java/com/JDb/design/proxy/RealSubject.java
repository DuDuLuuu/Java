package com.JDb.design.proxy;

public class RealSubject extends Subject {
	//具体实体
	public void doSomething() {
		//重写接口
		System.out.println("真实实体doSomething");
	}
}
