package com.JDb.design.simplefactory;



public class Addition extends Calculation {
	public double getResult() {
		result=numberA+numberB;
		System.out.println(numberA+"+"+numberB+"="+ result);
		return result;
	}
}
