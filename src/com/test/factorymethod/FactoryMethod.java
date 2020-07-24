package com.test.factorymethod;

public class FactoryMethod {
	public static void main(String[] args) {
		Factory factory=new FactoryA();
		Product product = factory.getProduct();
		product.print();
	}
}

abstract class Factory {
	public abstract Product getProduct();
}

class FactoryA extends Factory{

	@Override
	public Product getProduct() {
		return new ProductA();
	}

}

abstract class Product {
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
