package com.JDb.design.builder;

public class test {
	public static void main(String[] args) {
		//创建者模式
		Builder concreteBuilderA=new ConcreteBuilderA();
		Builder concreteBuilderB=new ConcreteBuilderB();
		Director director=new Director();
		director.Construct(concreteBuilderA);
		director.Construct(concreteBuilderB);
		Product product=concreteBuilderA.getProduct();
		Product product2=concreteBuilderB.getProduct();
		product.show();
		product2.show();
	}
	
}
