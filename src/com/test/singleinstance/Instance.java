package com.test.singleinstance;

public class Instance{
	private static Instance instance;//声明为static使该对象属于类.
	private Instance(){}
//	public synchronized Instance getInstance(){//加上synchronized,防止多线程同时调用而破坏单例模式
//		if(instance==null) {
//			instance = new Instance();
//		}
//		return instance;
//	}
	
	public Instance getInstance() {
		return instance;
	}

}