package com.JDb.design.handler;

public class ConcreteHandler1 extends Handler{

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>0&&request<=2) {
			System.out.println("0-2一级处理");
		}else if(null!=successor){
			successor.HandleRequest(request);
		}
	}

}
