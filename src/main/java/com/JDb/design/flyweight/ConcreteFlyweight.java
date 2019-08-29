package com.JDb.design.flyweight;

public class ConcreteFlyweight extends Flyweight {

	@Override
	public void Operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("共享"+extrinsicstate);
	}

}
