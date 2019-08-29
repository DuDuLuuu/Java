package com.JDb.design.handler;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1=new ConcreteHandler1();
		Handler h2=new ConcreteHandler2();
		h1.SetSuccessor(h2);
		
		int[] request= {1,3,2,4};
		for (int i : request) {
			h1.HandleRequest(i);
		}
	}

}
