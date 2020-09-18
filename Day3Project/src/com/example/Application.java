package com.example;

import java.util.Scanner;

import com.training.inter.Rent;

public class Application {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int key=sc.nextInt();
	
	User us=new User();
	
	Rent it=us.getProduct(key);
	
	System.out.println(it.calcRent());
		
	}

}
