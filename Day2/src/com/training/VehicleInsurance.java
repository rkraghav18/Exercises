package com.training;

public class VehicleInsurance extends Insurance{

	
	private String vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	
	
	public VehicleInsurance(int policyNumber, double insuredAmount, String policyHolderName, int age,String vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super(policyNumber,insuredAmount,policyHolderName,age);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	
	
	public String getVehicleModel() {
		return vehicleModel;
	}
	
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	
	public double getCostOfVehicle() {
		return costOfVehicle;
	}
	
	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}
	
	

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleModel=" + vehicleModel + ", yearOfManufacture=" + yearOfManufacture
				+ ", costOfVehicle=" + costOfVehicle + "]";
	}


	public double calculatePremium() {
		double premium=0;
			if(this.getVehicleModel().equals("Two")){
					
				if(2020-this.getYearOfManufacture()<2) {
				premium=0.5*this.getCostOfVehicle();
				}
				
				else {
					premium=0.6*this.getCostOfVehicle();
				}
				
		}
			if(this.getVehicleModel().equals("Four")) {
				
				if(2020-this.getYearOfManufacture()<2) {
				premium=0.4*this.getCostOfVehicle();
				}
			else {
				premium=0.5*this.getCostOfVehicle();
			}
		}
			return premium;
	}
	
}
