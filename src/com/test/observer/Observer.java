package com.test.observer;

public abstract class Observer {
	   protected Subject subject;
	   public abstract void update();
}

class Observer1 extends Observer{
	public Observer1(Subject subject) {
		this.subject=subject;
	}
	@Override
	public void update() {
		System.out.println("observer1 is notyfied,the new subject state is"+subject.getState());
		
	}
	
}
class Observer2 extends Observer{
	public Observer2(Subject subject) {
		this.subject=subject;
	}
	@Override
	public void update() {
		System.out.println("observer2 is notyfied,the new subject state is"+subject.getState());
		
	}
	
}