package com.JDb.design.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> list=new ArrayList<>();
	public void add(String string) {
		list.add(string);
	}
	public void show() {
		System.out.println("产品创建 ");
		for(String string:list) {
			System.out.println("产品展示："+string);
		}
	}
}
