package com.test.abstractfactory;

public class AbstractFactory {
	public static void main(String[] args) {

	}
}

abstract class SuperFactory {
	public abstract Product getProduct();
	public abstract Computer getComputer();
}

class FactoryA extends SuperFactory{

	@Override
	public Product getProduct() {
		return new ProductA();
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return null;
	}

}

class FactoryB extends SuperFactory{

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class MacFactory extends SuperFactory{

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return new Mac();
	}
	
}

class XiaomiFactory extends SuperFactory{

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return new XiaoMi();
	}
	
}

abstract class Product {
	public abstract void print();
	
}

abstract class Computer{
	public abstract void print();
}

class ProductA extends Product{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("product a");
	}
}

class ProductB extends Product{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("product b");
	}
}

class Mac extends Computer{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}
	
}

class XiaoMi extends Computer {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("xiaomi");
	}
	
}