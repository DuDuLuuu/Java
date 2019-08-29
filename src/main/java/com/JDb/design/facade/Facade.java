package com.JDb.design.facade;

public class Facade {
	 subSystemOne subSystemOne;
	 subSystemTwo subSystemTwo;
	public Facade() {
		subSystemOne=new subSystemOne();
		subSystemTwo=new subSystemTwo();
	}
	public void MethodA() {
		//组合方法A
		System.out.println("组合方法A：");
		subSystemOne.MethodOne();
	}
	public void MethodB() {
		System.out.println("组合方法B：");
		subSystemOne.MethodOne();
		subSystemTwo.MethodTwo();
	}
}
