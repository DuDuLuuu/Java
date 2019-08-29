package com.JDb.design.state;

public class NoonState extends State{

	@Override
	void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<13)
		{
			System.out.println("中午");
		}else {
			System.out.println("结束");
		}
	}

}
