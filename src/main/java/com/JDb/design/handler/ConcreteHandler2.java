package com.JDb.design.handler;

public class ConcreteHandler2 extends Handler{

	@Override
	public void HandleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>2&&request<5) {
			System.out.println("3-5  二级处理");
		}else if(null!=successor){
			successor.HandleRequest(request);
		}
	}

}
