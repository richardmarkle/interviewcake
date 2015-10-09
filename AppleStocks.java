package com.markle;

import java.util.Random;

/**
 * 
 * @author rich
 * This is class generates an array of random integers, representing the prices 
 * of Apple stock min-to-min over the course of a trading day.  It then computes 
 * the maximum amount of profit one could make buy then selling the stock
 * 
 *
 */
public class AppleStocks {
	int[] arr = null;

	public AppleStocks() {
		// trading day is 9:30 - 4:00pm -> 390 mins
		buildArray(100);
	}

	public static int[] buildArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			// next random over the interval (a,b)
			arr[i] = getNextRandom(400,800);
		}

		return arr;
	}

	public static int getNextRandom(int min, int max) {
		Random randNum = new Random();
		return randNum.nextInt((max - min) + 1) + min;

	}

	public static void main(String[] args) {

		// 390 mins in trading day 9:30-4:30pm
		int[] arr = buildArray(390);
		int low = arr[0];
		int high = arr[0];
		int profit = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " is " + arr[i]);
			if (arr[i] < low) {
				low = arr[i];
			} else if (arr[i] > high) {
				high = arr[i];
			}

			// keep a running best profit computation
			if (high - low > profit) {
				profit = high - low;
			}
		}

		System.out.println("The max profit is " + profit);

	}

}
