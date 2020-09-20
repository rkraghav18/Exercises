package com.training.example.two;

import com.training.inter.Automobile;

public class ShowroomNew extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		if(key==3) {
			return new Tractor();
		}
		else {
			return super.getProduct(key);
		}
	}
	
	

}
