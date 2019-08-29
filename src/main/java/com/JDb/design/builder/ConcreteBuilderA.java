package com.JDb.design.builder;

public class ConcreteBuilderA extends Builder{
	private Product product=new Product();
	@Override
	void methodA() {
		// TODO Auto-generated method stub
		product.add("部件A1");
	}

	@Override
	void methodB() {
		// TODO Auto-generated method stub

		product.add("部件A2");
	}
	public Product getProduct() {
		return product;
	}
}
