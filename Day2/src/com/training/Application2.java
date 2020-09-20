package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Insurance ins=new Insurance(1001,23500.00,"Rajesh",30);
		System.out.println(ins.calculatePremium());
		
		VehicleInsurance vins=new VehicleInsurance(1002,34500,"Farhan",30,"Two",2008,300000);
		
		System.out.println(vins.calculatePremium());
		
		
	}

}
