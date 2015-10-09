package com.markle;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBuilderTestRunner {
	static int size = 100;
	static int currentVal = 0;

	public static void main(String[] args) {
		ArrayBuilder ab = new ArrayBuilder(size);
		int[] valArray = new int[size];
		int[] dupeArray = new int[size];

		for (int k = 0; k <= 10; k++) {
			for (int i = 0; i < ab.arr.length - 1; i++) {
				currentVal = ab.arr[i];
				System.out.println("The value at original array " + i + " is " + currentVal);
				if (valArray[currentVal] == 0) {
					System.out.println("The value at " + currentVal + " is " + valArray[currentVal]);
					valArray[currentVal] = 1;
					System.out.println("Inserting 1 at " + (currentVal));
				} else {
					System.out.println("Inserting at " + currentVal + " in duplicate array");
					dupeArray[i] = currentVal;
				}
			}

			int j = 0;
			while (dupeArray[j] != 0) {
				System.out.println(dupeArray[j] + " is a duplicate");
				j++;
			}

		}
	}
}
