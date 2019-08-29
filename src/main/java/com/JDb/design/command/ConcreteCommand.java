package com.JDb.design.command;

public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	void Excute() {
		// TODO Auto-generated method stub
		receiver.Action();
	}

}
