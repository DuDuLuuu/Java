package com.JDb.design.state;

public class Work {
	public Work() {
		state=new ForenoonState();
	}
	private State state;
	private Double hour;
	private Boolean finish=false;
	
	public Double getHour() {
		return hour;
	}
	public void setHour(Double hour) {
		this.hour = hour;
	}
	public Boolean getFinish() {
		return finish;
	}
	public void setFinish(Boolean finish) {
		this.finish = finish;
	}
	public void SetState(State s) {
		state=s;
	}
	public void WriteProgram() {
		state.WriteProgram(this);
	}
}
