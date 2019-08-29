package com.JDb.design.adapter;

import java.math.BigDecimal;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//适配器模式
		Tager tager=new Adapter();
		tager.Request();
		BigDecimal bigDecimal=new BigDecimal(1.532754);
		bigDecimal=bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println(bigDecimal.ONE);
		
		
		Long l=1234567222222L;
		BigDecimal b=BigDecimal.valueOf(l);
		System.out.println(b);
	}

}
