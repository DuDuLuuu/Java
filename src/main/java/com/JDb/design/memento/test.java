package com.JDb.design.memento;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//备忘录模式
		Originator o=new Originator();
		o.setState("ON");
		o.show();
		Caretaker c=new Caretaker();
		c.setMemento(o.CreateMemento());
		o.setState("OFF");
		o.show();
		o.SetMemento(c.getMemento());
		o.show();
		
	}

}
