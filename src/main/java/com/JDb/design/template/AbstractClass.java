package com.JDb.design.template;

public abstract class AbstractClass {
	public abstract void PrimitiveOperation1();
	public abstract void primitiveOperation2();
	public void TemplateMethod() {
		PrimitiveOperation1();
		primitiveOperation2();
		System.out.println("this is templateMethod");
	}
}
