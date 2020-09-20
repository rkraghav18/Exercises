package com.training.example.two;
import java.util.*;

import com.training.inter.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ShowRoom saiCars=new ShowroomNew();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		
			int choice=sc.nextInt();
		if(choice==0) {
			break;
		}
		
		Automobile selected = saiCars.getProduct(choice);
		
		if(selected==null) {
			
			System.out.println("Select a value from 1 to 3");
		}
		
		else {
		
		saiCars.printQuotation(selected);
		}
		
		}
	}

}
