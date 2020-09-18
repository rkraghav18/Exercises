package com.example;

public class WrapperAndStatic {

	
	private int id;
	private static String aadharNumber;
	
	public void show() {
		System.out.println(id);
		System.out.println(aadharNumber);
	}
	
	public static void display() {
		System.out.println(aadharNumber);
		//Accessing non-static variable from static method
		//System.out.println(id);
	}
	
	
	public void parse(String number) {
		int num = Integer.parseInt(number);
		
		System.out.println(num);
	}
	
	public String useToString(int number) {
		return Integer.toString(number);
	}
	
	
	public int useValueOf() {
		String age="45";
		
		return Integer.valueOf(age,10);
	}
	
	
	
	public static void main(String[] args) {
		WrapperAndStatic obj=new WrapperAndStatic();
		obj.useValueOf();
	}
}
