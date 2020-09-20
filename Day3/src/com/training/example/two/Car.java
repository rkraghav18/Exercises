package com.training.example.two;

import com.training.inter.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota Altis";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000.00;
	}

}
