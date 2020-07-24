package com.test.adaper;

public class Car {
	public void run() {
		System.out.println("能跑");
	}
	
	public static void main(String[] args) {
		CarAdapter carAdapter=new CarAdapter(new Car());
		carAdapter.runAndFly();
	}
}

interface fly{
	abstract void flyInSky();
}

class CarAdapter implements fly{
	private Car car;
	
	public CarAdapter(Car car) {
		this.car=car;
	}
	
	@Override
	public void flyInSky() {
		System.out.println("能天上飞");
	}
	
	public void runAndFly() {
		car.run();
		flyInSky();
	}
	
}