package com.training.files;

import java.util.NoSuchElementException;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BookService bs=new BookService();
			
			Book book1 = new Book();
			book1.setAuthor("Suraj");
			book1.setBookId(232);
			book1.setPrice(300.00);
			book1.setBookName("Ads");
			
			Book book2 = new Book();
			book2.setAuthor("Raju");
			book2.setBookId(254);
			book2.setPrice(200.00);
			book2.setBookName("Fire and Ice");
			
			bs.add(book2);
			bs.add(book1);
			
			System.out.println(bs.getOne(254).getBookName());
			bs.getAll();
			
		}
		catch(MyCustomException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch(RangeCheckException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NoSuchElementException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
