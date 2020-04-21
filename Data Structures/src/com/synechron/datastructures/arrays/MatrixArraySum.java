package com.synechron.datastructures.arrays;

import java.util.Scanner;

public class MatrixArraySum { 

	public Scanner scObj = new Scanner(System.in);
	static void printDiagonalSums(int [][]mat, 
										int n) 
	{ 
		int principal = 0, secondary = 0; 
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 
	
				if (i == j) 
					principal += mat[i][j]; 
	
				if ((i + j) == (n - 1)) 
					secondary += mat[i][j]; 
			} 
		} 
	
		System.out.println(" Diagonal sum is :" + principal); 
									
		System.out.println(" Diagonal Sec:"+ secondary); 
	} 

	// Driver code 
	static public void main (String[] args) 
	{ 
		  int arr[][] = {{1, 2, 3, 4 },
				  		{5, 6, 7, 8 }, 
				  		{1, 2, 3, 4 }, 
				  		{5, 6, 7, 8 }};
		    
		  
		printDiagonalSums(arr, 4); 
	} 
}

