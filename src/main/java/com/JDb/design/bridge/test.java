package com.JDb.design.bridge;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//桥接模式
		Abstraction abstraction=new RefinedAbstraction();
		abstraction.SetImplementor(new ConcreteImplementorA());
		abstraction.Operation();
		abstraction.SetImplementor(new ConcreteImplementorB());
		abstraction.Operation();
	}

}
