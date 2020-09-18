package com.training.exceptions;

public class MyCustomException extends Exception {
	
	private String message;

	public MyCustomException(String message,Throwable th) {
		super();
		this.message = message+th.getMessage();
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception: "+message;
	}
	
	

}
