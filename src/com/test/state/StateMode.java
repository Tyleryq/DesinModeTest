package com.test.state;
public class StateMode{
	public static void main(String[] args) {
		CarContext car=new CarContext();
		car.changeState(new FullGasState());
		car.run();
		car.changeState(new LessGasState());
		car.run();
	}
}

abstract class State{
	abstract void run();
}

class FullGasState extends State{

	@Override
	void run() {
		System.out.println("跑的快");
	}
	
}

class LessGasState extends State{
	
	@Override
	void run() {
		System.out.println("跑的慢");
	}
	
}

class CarContext {
	private State state;
	public void changeState(State state) {
		this.state=state;
	}
	public void run() {
		state.run();
	}
}