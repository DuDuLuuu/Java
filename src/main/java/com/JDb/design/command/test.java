package com.JDb.design.command;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//命令模式
		Receiver r=new Receiver();
		Command command=new ConcreteCommand(r);
		Invoker invoker=new Invoker();
		invoker.setCommand(command);
		invoker.doExcute();
		
		
		char[] arr=new char[] {'1','2','3','4','5'};
		String string=new String(arr, 0, arr.length);
		System.out.println(string);
		
		System.out.println(string.concat("fff"));
	}

}
