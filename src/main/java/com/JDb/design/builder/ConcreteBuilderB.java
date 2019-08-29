package com.JDb.design.builder;

public class ConcreteBuilderB extends Builder {
	private Product product=new Product();
	@Override
	void methodA() {
		// TODO Auto-generated method stub
		product.add("部件X");
		
	}

	@Override
	void methodB() {
		// TODO Auto-generated method stub
		product.add("部件Y");
	}
	public Product getProduct() {
		return product;
	}
}
