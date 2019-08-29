package com.JDb.design.composite;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//组合模式
		Composite root=new Composite("bz");
		root.add(new Leaf("leaf1"));
		root.add(new Leaf("leaf2"));
		Composite composite=new Composite("fgs");
		composite.add(new Leaf("fgs1"));
		composite.add(new Leaf("fgs2"));
		root.add(composite);
		
		root.display(1);
	}

}
