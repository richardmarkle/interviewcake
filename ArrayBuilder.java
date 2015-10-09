package com.markle;

import java.util.Collections;
import java.util.Random;;

@SuppressWarnings("unused")
public class ArrayBuilder {
	int[] arr = null;
	
	public ArrayBuilder(int size){
		this.arr = new int[size];
		for(int i=0; i < arr.length; i++){
			arr[i]=this.getNextRandom(-400,0);
		}
	}

	public int getNextRandom(int min, int max) {
		Random randNum = new Random();
		return randNum.nextInt((max - min) + 1) + min;

	}
	
	

}
