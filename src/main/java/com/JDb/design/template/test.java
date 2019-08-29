package com.JDb.design.template;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模板模式
		AbstractClass c;
		c=new ConcreteClassA();
//		c.PrimitiveOperation1();
//		c.primitiveOperation2();
		c.TemplateMethod();
		c=new ConcreteClassB();
//		c.PrimitiveOperation1();
//		c.primitiveOperation2();
		c.TemplateMethod();
	}

}
