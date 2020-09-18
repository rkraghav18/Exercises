package com.training.files;

import java.util.NoSuchElementException;

public class BookService {
	
	private Book[] bk=new Book[10];
	private int index=0;
	boolean found=false;
	
	public void add(Book bk) {
		this.bk[index]=bk;
		index++;
	}
	
	public Book getOne(int bookId) throws NoSuchElementException{
		found=false;
		for(int j=0;j<index;j++) {
			if(bk[j].getBookId()==bookId) {
				found=true;
				return bk[j];
			}
		}
		if(found==false) {
			throw new NoSuchElementException();
			}
		else {
			return null;
		}
	}
	public Book[] getAll(){
		return bk;
	}

}
