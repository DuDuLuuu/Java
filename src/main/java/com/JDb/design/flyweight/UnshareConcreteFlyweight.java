package com.JDb.design.flyweight;

public class UnshareConcreteFlyweight extends Flyweight {

	@Override
	public void Operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("不共享"+extrinsicstate);

	}

}
