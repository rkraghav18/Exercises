package com.training;

public class ManageProduct {
	
	public Product[] calculateDiscount(Product[] product) {
		
		
		for(Product prod:product) {
		
		if(prod.getRatePerUnit()>500 && prod.getRatePerUnit()<=1000) {
			prod.setDiscount(0.10);
			
		}else if(prod.getRatePerUnit()>1000) {
			
			prod.setDiscount(0.15);
		}
		
		}
		return product;
	}
	
	public double calculateTax(Product product) {
		
		double tax=0.0;
		
		switch(product.getProductType()) {
		
		case 1:
			tax=5;
			break;
		case 2:
			tax=10;
			break;
		case 3:
			tax=15;
			break;
		default:
			tax=28;
		}
		
		return tax;
	}

	public void showProductsLegacy(Product[] productList) {
		
		for(int i=0;i<productList.length;i++) {
			System.out.println("product"+i+"="+productList[i].getProductName());
		}
	}
	
	public void showProductForEach(Product[] productList) {
		for(Product eachProduct:productList) {
			System.out.println(eachProduct.getProductName()+":"+eachProduct.getRatePerUnit());
		}
	}
	
	public double calculateAmount(Product product) {
		double amt=(product.getRatePerUnit()*product.getQuantity())-product.getDiscount()*(product.getRatePerUnit()*product.getQuantity());
		return amt;
	}
}
