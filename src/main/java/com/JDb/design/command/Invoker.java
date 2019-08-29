package com.JDb.design.command;



public class Invoker {
	private Command command;
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void doExcute() {
		command.Excute();
	}
}
