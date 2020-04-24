package com.synechron.datastructures.arrays;

public class ShiftZeroes {

	public static void main(String[] args) {

		int arr[] = { 6, 0, -3, 0, 0, 4 };

		int index = 0;
		int nonZeroCount = 0;
		int arrLength = arr.length;

		for (index = 0; index < arrLength; index++) {
			if (arr[index] != 0)
				arr[nonZeroCount++] = arr[index];

		}
		while (nonZeroCount < arrLength) {
			arr[nonZeroCount] = 0;
			++nonZeroCount;
		}

		for (index = 0; index < arrLength; index++)
			System.out.print(arr[index] + " -> ");
		System.out.print("NULL");
	
	}

}
