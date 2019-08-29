package com.JDb.design.state;

public class ForenoonState extends State{

	@Override
	void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<12) {
			System.out.println("上午");
		}else {
			work.SetState(new NoonState());
			work.WriteProgram();
		}
	}
	
}
