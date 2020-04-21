package com.synechron.datastructures.arrays;

import java.util.Scanner;

/* { 1, 4, 20, 3 , 10 , 5 }
 *  SUM IS 33
 * Index to be found bw 2-4
 * */
class ReturnSubArray{
	public static int findSubArray(int arr[], int n, int sum) {
		Integer index = 0;
		Integer inner = 0;
		Integer result = 0;
		//   { 1, 4, 20, 3 , 10 , 5 } SUM -> 33
		
		
		int curr_sum, i, j; 
		  
        // Pick a starting point 
        for (i = 0; i < n; i++)  
        { 
            curr_sum = arr[i]; 
  
            // try all subarrays starting with 'i' 
            for (j = i + 1; j <= n; j++)  
            { 
                if (curr_sum == sum)  
                { 
                    int p = j - 1; 
                    System.out.println("Sum found between indexes " + i 
                            + " and " + p); 
                    return 1; 
                } 
                if (curr_sum > sum || j == n) 
                    break; 
                curr_sum = curr_sum + arr[j]; 
            } 
        } 
        System.out.println("No subarray found"); 
        return 0;
	}
	 
}

public class SubArray {
	public static void main (String args[]) {
		int arr[] = {0};
		int size = 0;
		int index = 0;
		int rotateBy = 2;
		int sum = 0;
		Scanner scObj = new Scanner(System.in);
		
		int first = Integer.MIN_VALUE;
		
		System.out.println("Enter required Sum : ");
		sum = scObj.nextInt();
		System.out.println("Enter array size : ");
		size = scObj.nextInt();
		arr = new int[size];
		System.out.println("Enter " + size + " Elements");

		for (index = 0; index < size; index++)
			arr[index] = scObj.nextInt();
		ReturnSubArray.findSubArray(arr, size, sum);	
	}
}


 