package com.training;

public class Application {
	
	public static void main(String[] args) {
		
		Lawyer rajesh = new Lawyer(233224,"Rajesh Khanna","High Court","B.L");
		
		Musician sharma=new Musician(545656,"Ramesh Sharma","Shenoy","Allahabad");
		
		Billing bill=new Billing();
		
		bill.printFees(rajesh);
		bill.printFees(sharma);
	}

}
