/**
 * 
 */
package com.markle;

/**
 * @author rich
 *
 */
public class IDXMultiplication {
	int[] arr = { 2, 4, 3, 7, 9 };
	int firstHalfProduct = 0;
	int secondHalfProduct = 0;
	int temp = 1;

	public IDXMultiplication() {
		//split array into two pieces (inefficiency comes from repeated computations)
		firstHalfProduct = partialProduct(0, Math.round(arr.length / 2));
		secondHalfProduct = partialProduct((Math.round(arr.length) + 1) / 2, arr.length - 1);
		System.out.println(
				"The first partial product from 0 to " + Math.round(arr.length / 2) + " is " + firstHalfProduct);

		System.out.println("The second partial product from " + (Math.round(arr.length / 2) + 1) + " to "
				+ (arr.length - 1) + " is " + secondHalfProduct);
		
	}
	
	public int computeFinalArrayValue(int startingIdx, int endingIdx){
		if(startingIdx == endingIdx){
			return arr[endingIdx];
		} else {
			return arr[endingIdx] * computeFinalArrayValue(startingIdx + 1, endingIdx);
		}
	}

	public int partialProduct(int startingIdx, int endingIdx) {
		
		if (startingIdx == endingIdx) {
			return arr[endingIdx];
		} else {
			return arr[endingIdx] * partialProduct(startingIdx, endingIdx - 1);
		}

	}

	public static void main(String[] args) {
		IDXMultiplication idx = new IDXMultiplication();
	}
}
