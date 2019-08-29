package com.JDb.design.strategy;

public class Context {
	Strategy strategy;
	//环境对象，实习对策略对象的控制调用具体策略
/*	public Context(Strategy strategy)
	{
		this.strategy=strategy;
	}*/
	public Context(String strategyName) {
		switch (strategyName) {
		case "A":
			strategy=new ConcreteStrategyA();
			break;
		case "B":
			strategy=new ConcreteStrategyB();
			break;
		}
	}
	
	public void doStrategy() {
		strategy.algorithmInterface();
	}
}
