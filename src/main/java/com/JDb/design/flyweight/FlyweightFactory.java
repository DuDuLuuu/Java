package com.JDb.design.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable<String, Flyweight> flyweights=new Hashtable<>();
	public FlyweightFactory() {
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	public Flyweight GetFlyweight(String key) {
		return flyweights.get(key);
	}
	
	public int GetCount() {
		return flyweights.size();
	}
}
