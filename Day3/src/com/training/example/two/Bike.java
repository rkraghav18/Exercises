package com.training.example.two;

import com.training.inter.Automobile;

public class Bike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsar";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 105000.00;
	}

}
