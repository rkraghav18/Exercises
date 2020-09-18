package com.training.files;
import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int bookId, String bookName, String author, double price) throws RangeCheckException {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		if(price<100.00||price>500.00) {
			throw new RangeCheckException("Book Price Not in range");
		}
		this.price = price;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) throws MyCustomException{
		try {
			if(bookName==null) {
				throw new NullPointerException();
			}
			this.bookName = bookName;
			}
			catch(NullPointerException e) {
				throw new MyCustomException("Book Name Should not be null",e);
			}
		
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) throws RangeCheckException{
		try {
			if(price<100.00||price>500.00) {
				throw new RangeCheckException("Book Price not in Range");
			}
		}
			catch(RangeCheckException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			this.price = price;	
		
		
	}
	
	

}
