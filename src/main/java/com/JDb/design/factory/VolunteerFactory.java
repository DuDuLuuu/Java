package com.JDb.design.factory;

public class VolunteerFactory implements Factory {

	@Override
	public Leifeng createLeifeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}
}
