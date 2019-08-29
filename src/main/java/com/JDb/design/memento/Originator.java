package com.JDb.design.memento;

public class Originator {
//发起人
	private String state;
	public Memento CreateMemento() {
		return (new Memento(state));
	}
	public void SetMemento(Memento memento) {
		state=memento.getState();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void show() {
		System.out.println("显示数据"+state);
	}
}
