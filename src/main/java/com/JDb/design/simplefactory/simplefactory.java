package com.JDb.design.simplefactory;

public class simplefactory {
	public static Calculation createCalculation(String key) {
		Calculation calculation=null;
		switch (key) {
		case "+":calculation=new Addition();			
			break;
		case "-":calculation=new Subtraction();
			break;
		}
		return calculation;
	}
}
