package com.example;

import com.training.inter.Rent;

public class Computer implements Rent {
	
	private String name;
	private int quantity;
	private int ratePerUnit;
	private int days;

	public Computer(String name, int quantity, int ratePerUnit, int days) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.ratePerUnit = ratePerUnit;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	
	public double calcRent() {
		return this.quantity*this.ratePerUnit*this.days;
	}
		

	
	

}
