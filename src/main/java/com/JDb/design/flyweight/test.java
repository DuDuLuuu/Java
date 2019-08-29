package com.JDb.design.flyweight;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//享元模式
		int extrinsicstate=22;
		FlyweightFactory f=new FlyweightFactory();
		Flyweight fx= f.GetFlyweight("X");
		fx.Operation(--extrinsicstate);

		Flyweight fy=f.GetFlyweight("Y");
		fy.Operation(--extrinsicstate);
		
		Flyweight fz=f.GetFlyweight("Z");
		fz.Operation(--extrinsicstate);
		
		
		UnshareConcreteFlyweight uf=new UnshareConcreteFlyweight();
		uf.Operation(--extrinsicstate);
		
		System.out.println("对象数量"+f.GetCount());
	}

}
