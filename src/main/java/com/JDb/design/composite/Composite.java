package com.JDb.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	List<Component> children=new ArrayList<>();
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	void display(Integer depth) {
		// TODO Auto-generated method stub
		System.out.println(new String(depth.toString())+name);
		for (Component component : children) {
			component.display(depth+2);
		}
	}

}
