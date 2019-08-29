package com.JDb.design.mediator;

public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator) {
		this.mediator=mediator;
	}
}
