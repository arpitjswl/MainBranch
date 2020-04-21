package com.synechron.datastructures.arrays;

import java.util.Scanner;

// Input --> int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 

class SortArray1s{
	public static void main (String args[]) {
		Scanner scObj = new Scanner(System.in);
		int arr[] = {0};
		int arrSize = 0;
		int index = 0;
		int zeroCount = 0;
		int onesCount = 0;
		int twosCount = 0;
		System.out.println("Enter array Size : ");
		arrSize = scObj.nextInt();
		arr = new int[arrSize];
		
		System.out.println("Enter " +  arrSize + " Elements");
		for (index = 0; index < arrSize; index++) {
			arr[index] =  scObj.nextInt();
		}
		
		
		// Logic goes here
		
		for (index = 0; index < arrSize; index++) {
			if (arr[index] == 0)
				++zeroCount;
			
			if (arr[index] == 1)
				++onesCount;
			
			if (arr[index] == 2)
				++twosCount;
		}
		
		for (index = 0; index < zeroCount; index++)
			arr[index] = 0;
		
		for (index = zeroCount; index < (zeroCount + onesCount); index++)
			arr[index] = 1;
		
		for (index = onesCount+zeroCount; index < arrSize; index++)
			arr[index] = 2;
		
		System.out.print("Array : ");
		for (index = 0; index < arrSize; index++) {
			System.out.print(arr[index] + "->");
		}
		System.out.print("NULL");
		System.out.println();
	}
}