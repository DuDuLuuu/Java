package com.JDb.design.simplefactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Calculation addition=new Addition();
		addition.setNumberA(1);
		addition.setNumberB(22);
		addition.getResult();*/
		//简单工厂模式
		//核心思想：创建工厂类，通过给工厂类传参数，让工厂创建对应实例.
		Calculation calculation=simplefactory.createCalculation("+");
		calculation.setNumberA(5);
		calculation.setNumberB(3);
		calculation.getResult();
		
		Calculation c=simplefactory.createCalculation("-");
		c.setNumberA(5);
		c.setNumberB(3);
		c.getResult();
	}

}
