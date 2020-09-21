package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CreditCard user1=new CreditCard(3322,"Girish",30000.00,1200.00);
		
		CreditCard user2=new CreditCard(3356,"Hitesh",50000.00,7000.00);
		
		CreditCard[] card= {user1,user2};
		
		BusinessService service = new BusinessService();
		
		System.out.println(service.writeByte(card));
		
		CreditCard[] ans=service.readObject();
		for(CreditCard c:ans) {
			System.out.println(c.getHolderName());
		}
		
		System.out.println(service.writeByte(card, "E:/"));
		
		service.writeToFile("E:/", 1, card);
		
		CreditCard[] ans2=service.readFromFile(card.length);
		for(CreditCard c:ans2) {
			System.out.println(c.getHolderName());
		}
		
		service.deleteCard(card.length,"hitesh");
		
		
	}

}
