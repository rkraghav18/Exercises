package com.training;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;



public class BusinessService {
	
	public void writeToByte(String loc,int choice, CreditCard[] card) {
		switch(choice) {
		case 1:
			writeByte(card);
			break;
		case 2:
			writeByte(card,loc);
			break;
		default:
			System.out.println("Invalid Input");;
		}
		
	}
	
	public void writeToFile(String loc, int choice, CreditCard[] card) {
		switch(choice) {
		case 1:
			writeFile(card);
			break;
		case 2:
			writeFile(loc,card);
			break;
		default:
			System.out.println("Invalid Input");;
		}
		
	}
	
	
	
	public boolean writeByte(CreditCard[] card) {
		
		boolean persisted=false;
		
		ObjectOutputStream outStream = null;
		
		try {
			outStream=new ObjectOutputStream(new FileOutputStream(new File("card.ser"),true));
			
			
			outStream.writeObject(card);
			
			persisted=true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
				outStream.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return persisted;
		
	}
	
	
	
public boolean writeByte(CreditCard[] card,String loc) {
		
		boolean persisted=false;
		
		ObjectOutputStream outStream = null;
		try {
			outStream=new ObjectOutputStream(new FileOutputStream(new File(loc+"card.ser"),true));
			
			
			outStream.writeObject(card);
			
			persisted=true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
				outStream.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return persisted;
		
	}
	
	
	
	public CreditCard[] readObject() {
		CreditCard[] cards=new CreditCard[10];
		ObjectInputStream inStream=null;
		
		try {
			inStream = new ObjectInputStream(new FileInputStream(new File("card.ser")));
			
		cards=(CreditCard[]) inStream.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inStream.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return cards;
	}

	
	public boolean deleteCard(int length,String name) {
		boolean persisted=false;
		CreditCard[] card=new CreditCard[length];
		int i=0;
		int index=0;
		BufferedReader br = null;
		
		try {
			 br = new BufferedReader(new FileReader(new File("cards.txt")));
			
			String line = null;
			
			while((line= br.readLine())!=null) {
				CreditCard temp=new CreditCard();
				String[] arr =line.split(",");
				temp.setCardNumber(Integer.parseInt(arr[0]));
				temp.setHolderName(arr[1]);
				temp.setOutstandingBalance(Double.parseDouble(arr[2]));
				card[i++]=temp;
			}
		}catch(EOFException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int j=0;j<card.length;j++) {
			if(card[j].getHolderName().equalsIgnoreCase(name)) {
				index=j;
			}
		}
		
		CreditCard[] card2=new CreditCard[length-1];
		System.arraycopy(card, 0, card2, 0, index);
		System.arraycopy(card, index + 1,card2, index, card.length - index - 1); 
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter(new File("cards.txt")));
			for(int j=0;j<card2.length;j++) {
			writer.println(card2[j].toString());
			}
			persisted=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
		
		return persisted;
	}
	
	
	
	public boolean writeFile(CreditCard[] card) {
		
			boolean persisted=false;
			
			PrintWriter writer = null;
			try {
				writer = new PrintWriter(new FileWriter(new File("cards.txt"),true));
				for(int i=0;i<card.length;i++) {
				writer.println(card[i].toString());
				}
				persisted=true;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				writer.close();
			}
			return persisted;
		}
	
	
	
	public void writeFile(String loc,CreditCard[] card) {
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter(new File(loc+"cards.txt"),true));
			for(int i=0;i<card.length;i++) {
			writer.println(card[i].toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
	}
	
	
	public CreditCard[] readFromFile(int length) {
		CreditCard[] card=new CreditCard[length];
		int i=0;
		BufferedReader br = null;
		
		try {
			 br = new BufferedReader(new FileReader(new File("cards.txt")));
			
			String line = null;
			
			while((line= br.readLine())!=null) {
				CreditCard temp=new CreditCard();
				String[] arr =line.split(",");
				temp.setCardNumber(Integer.parseInt(arr[0]));
				temp.setHolderName(arr[1]);
				temp.setOutstandingBalance(Double.parseDouble(arr[2]));
				card[i++]=temp;
			}
		}catch(EOFException e) {
			e.printStackTrace();
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return card;
	}
	
}
