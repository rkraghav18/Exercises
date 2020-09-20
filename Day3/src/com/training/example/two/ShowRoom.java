package com.training.example.two;

import com.training.inter.Automobile;

public class ShowRoom {
	
	
	//Factory Method- Based on the key value
	//Return different objects
	
	public Automobile getProduct(int key) {
		
		switch (key) {
		case 1:
			return new Bike();
		case 2:
			return new Car();
		default:
			return null;
		}
	}
	
	public void printQuotation(Automobile auto) {
		
		System.out.println(auto.APPNAME);
		
		System.out.println(auto.getModel());
		System.out.println(auto.getColor());
		System.out.println(auto.getPrice());
		
	}

}
