package com.training;

public class Product extends Object{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	private int quantity;
	private int productType;
	private int productId;
	private double discount;
	private String productName;
	private double ratePerUnit;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productType,int productId, String productName, double ratePerUnit) {
		super();
		this.productType=productType;
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	
	



	public Product(int quantity, int productType, int productId, String productName, double ratePerUnit) {
		super();
		this.quantity = quantity;
		this.productType = productType;
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getRatePerUnit() {
		return ratePerUnit;
	}


	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	public int getProductType() {
		return productType;
	}


	public void setProductType(int productType) {
		this.productType = productType;
	}
	
	
	
}
