package com.training;

import java.io.Serializable;

public class CreditCard implements Serializable{
	
	private int cardNumber;
	private String holderName;
	private transient double creditLimit;
	private double outstandingBalance;
	
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CreditCard(int cardNumber, String holderName, double creditLimit, double outstandingBalance) {
		super();
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.creditLimit = creditLimit;
		this.outstandingBalance = outstandingBalance;
	}


	public int getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getHolderName() {
		return holderName;
	}


	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}


	public double getCreditLimit() {
		return creditLimit;
	}


	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}


	public double getOutstandingBalance() {
		return outstandingBalance;
	}


	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}


	@Override
	public String toString() {
		return cardNumber + "," +holderName + "," + outstandingBalance;
	}
	
	

}
