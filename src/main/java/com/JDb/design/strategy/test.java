package com.JDb.design.strategy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//策略模式
		//不同时间执行不同业务
		
//		Context context=new Context(new ConcreteStrategyA());
//		context.doStrategy();
//		context=new Context(new ConcreteStrategyB());
//		context.doStrategy();
		
		//加入简单工厂模式
		Context context=new Context("A");
		context.doStrategy();
		context=new Context("B");
		context.doStrategy();
	}

}
