package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Product tv=new Product(5,1,1010,"LED",24000.00);
		
		Product fridge=new Product(4,2,2121,"fridge",12000);
		
		ManageProduct mgr=new ManageProduct();
		
		
		
		double tax=mgr.calculateTax(tv);
		
		
		System.out.println("Tax="+tax+"%");
		
		Product[] productList=new Product[2];
		
		productList[0]=tv;
		productList[1]=fridge;
		
		mgr.calculateDiscount(productList);
		mgr.showProductsLegacy(productList);
		mgr.showProductForEach(productList);
		
		for(Product prod:productList) {
			System.out.println("Discount of "+prod.getProductName()+":"+prod.getDiscount());
			System.out.println("Final Price of "+prod.getProductName()+":"+mgr.calculateAmount(prod));
		}
	}

}
