package com.example;

import com.training.inter.Rent;

public class Furniture implements Rent{

	private String Name;
	private int quantity;
	private int ratePerUnit;
	private int days;
	
	
	public Furniture(String name, int quantity, int ratePerUnit, int days) {
		super();
		Name = name;
		this.quantity = quantity;
		this.ratePerUnit = ratePerUnit;
		this.days = days;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
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
