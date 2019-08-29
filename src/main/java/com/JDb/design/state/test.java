package com.JDb.design.state;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//状态模式
		Work hxb=new Work();
		hxb.setHour((double) 9);
		hxb.WriteProgram();
		hxb.setHour((double) 12);
		hxb.WriteProgram();
		hxb.setHour((double) 13);
		hxb.WriteProgram();
		
		
	}

}
