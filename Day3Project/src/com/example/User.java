package com.example;

import com.training.inter.Rent;

public class User {
	
	public Rent getProduct(int key) {
		switch(key) {
		case 1:
			return new Computer("HP",2,500,5);
		case 2:
			return new Furniture("Table",1,1500,5);
			default:
				return null;
		}
	}
	
	
	public void printQuotation(Rent item) {
		
		System.out.println(item.APPNAME);
		
		System.out.println(item.calcRent());
		
	}

}
