package com.arpit.basics;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int arr1[] =  {1,2,3,4,5};
		int arr2[] =  {6,7,8,9,10};
		int arr3[] = 	{0};
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		arr3 = new int[len1+len2];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		System.out.println(arr1.length);
		System.out.println(arr2[5 - 5]);
		
		  for (int j = arr1.length, i = 0; j < arr1.length + arr2.length; j++) {
			  arr3[j] = arr2[j - arr1.length]; }
		 
		
		System.out.println();
		System.out.println();
	
		
		for (int k = 0; k < arr3.length; k++) 
			System.out.println(arr3[k]);
		

	}

}
