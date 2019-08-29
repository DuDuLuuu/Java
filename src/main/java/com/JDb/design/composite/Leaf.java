package com.JDb.design.composite;

public class Leaf extends Component {
	
	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void add(Component c) {
		// TODO Auto-generated method stub

	}

	@Override
	void remove(Component c) {
		// TODO Auto-generated method stub

	}

	@Override
	void display(Integer depth) {
		// TODO Auto-generated method stub
		System.out.println("--"+name);
	}

}
