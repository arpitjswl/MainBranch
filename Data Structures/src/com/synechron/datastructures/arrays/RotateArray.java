package com.synechron.datastructures.arrays;

// 1,2,3,4,5,6,7
// 7,6,5,4,3,2,1
import java.util.Scanner;

public class RotateArray {
	
	
	 static void rotateArray(int arr[], int d, int n) 
	    { 
	        for (int i = 0; i < d; i++) 
	            leftRotatebyOne(arr, n); 
	    } 
	  
	 	// This method shift all elements to left 
	    static void leftRotatebyOne(int arr[], int n) 
	    { 
	        int i, temp; 
	        temp = arr[0]; 
	        for (i = 0; i < n - 1; i++) 
	            arr[i] = arr[i + 1]; 
	        arr[i] = temp; 
	    } 
	
	public static void main (String args[]) {
		int arr[] = {0};
		int size = 0;
		int index = 0;
		int rotateBy = 2;
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter array size : ");
		size = scObj.nextInt();
		arr = new int[size];
		System.out.println("Enter " + size + " Elements");
		
		for (index = 0; index < size; index++) {
			arr[index] = scObj.nextInt();
		}
		
		rotateArray(arr,rotateBy,size);
		System.out.print("Array : ");
		for (index = 0; index < size; index++) {
			System.out.print(arr[index] + "->");
		}
		System.out.print("NULL");
	}
}
