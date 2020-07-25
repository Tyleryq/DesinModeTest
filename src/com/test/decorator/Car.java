package com.test.decorator;


public class Car {
	public void run() {
		System.out.println("能跑");
	}
	
	public static void main(String[] args) {
		CarDecorator carDecorator = new CarDecorator(new Car());
		carDecorator.fly();
	}
}

class CarDecorator {
	protected Car car;
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	public void fly() {
		System.out.println("能飞");
	}
}
