package com.JDb.design.adapter;

public class Adapter extends Tager{
	private Adaptee adaptee=new Adaptee();
	public void Request() {
		adaptee.SpecificRequest();
	}
}
