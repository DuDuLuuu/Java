package com.JDb.design.command;

public abstract class Command {
	protected Receiver receiver;
	public Command(Receiver receiver) {
		this.receiver=receiver;
	}
	abstract void Excute();
}
