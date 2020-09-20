package com.training.example.two;

import com.training.inter.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Green";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Eicher 500";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1000000;
	}

}
