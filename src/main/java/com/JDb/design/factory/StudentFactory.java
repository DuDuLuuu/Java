package com.JDb.design.factory;

public class StudentFactory implements Factory {

	@Override
	public Leifeng createLeifeng() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
