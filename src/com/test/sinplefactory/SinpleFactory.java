package com.test.sinplefactory;

public class SinpleFactory {
	public static void main(String[] args) {
		Product product=Factory.getProduct("A");
		product.print();
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

class Factory{
	
	public static Product getProduct(String name) {
		Product product = null;
		if (name.equals("A")) {
			product=new ProductA();
		} else if(name.equals("B")){
			product=new ProductB();
		}
		return product;
	}
	
}