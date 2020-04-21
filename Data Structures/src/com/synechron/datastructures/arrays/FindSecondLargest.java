package com.synechron.datastructures.arrays;

class FindSecond {
	public static void print2largest(int arr[], int arr_size) {
		int i, first, second;

		
		if (arr_size < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr_size; i++) {
			
			if (arr[i] > first) {
				second = first;
				first = arr[i]; // In first iteration assign first and second largest the same Val
			}

			else if (arr[i] > second)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.print("There is no second largest" + " element\n");
		else
			System.out.print("The second largest element" + " is " + second);
	}
}

public class FindSecondLargest {

	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1}; 
        int n = arr.length; 
        FindSecond.print2largest(arr, n);
        
          
	}

}
