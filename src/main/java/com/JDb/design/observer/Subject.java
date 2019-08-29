package com.JDb.design.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> list=new ArrayList<>();
	public void Attach(Observer observer) {
		list.add(observer);
	};
	public void Detach(Observer observer) {
		list.remove(observer);
	};
	public void Notify() {
		for(Observer observer:list) {
			observer.doUpdate();
		}
	};
	
	
}
