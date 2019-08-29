package com.JDb.design.factory;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//工厂模式
		Factory factory=new StudentFactory();
		Leifeng sLeifeng= factory.createLeifeng();
		sLeifeng.xiwan();
		sLeifeng.saodi();
		factory=new VolunteerFactory();
		Leifeng vlLeifeng=factory.createLeifeng();
		vlLeifeng.xiwan();
		vlLeifeng.saodi();
		
	}

}