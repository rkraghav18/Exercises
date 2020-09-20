package com.training;

public class Insurance {
	
	
	private int policyNumber;
	private double insuredAmount;
	private String policyHolderName;
	private int age;


	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	
	


	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Insurance(int policyNumber, double insuredAmount, String policyHolderName, int age) {
		super();
		this.policyNumber = policyNumber;
		this.insuredAmount = insuredAmount;
		this.policyHolderName = policyHolderName;
		this.age = age;
	}


	public int getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}


	public double getInsuredAmount() {
		return insuredAmount;
	}


	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", insuredAmount=" + insuredAmount + ", policyHolderName="
				+ policyHolderName + ", age=" + age + "]";
	}


	public double calculatePremium() {
		
		double premium=0;
		
		if(this.age<25) {
			premium=0.6*this.insuredAmount;
		}
		else {
			premium=0.7*this.insuredAmount;
		}
		return premium;
	}
	
}
