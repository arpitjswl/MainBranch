package com.synechron.datastructures.arrays;

import java.util.Scanner;

public class PrintSpiralArray {
	
	 static void spiralPrint(int row, int col, int a[][]) 
	    { 
	        int i, k = 0, l = 0; 
	  
	        while (k < row && l < col) { 
	         
	            for (i = l; i < col; ++i) { 
	                System.out.print(a[k][i] + " "); 
	            } 
	            k++; 
	  
 
	            for (i = k; i < row; ++i) { 
	                System.out.print(a[i][col - 1] + " "); 
	            } 
	            col--; 
	  
 
	            if (k < row) { 
	                for (i = col - 1; i >= l; --i) { 
	                    System.out.print(a[row - 1][i] + " "); 
	                } 
	                row--; 
	            } 
	  
	            if (l < col) { 
	                for (i = row - 1; i >= k; --i) { 
	                    System.out.print(a[i][l] + " "); 
	                } 
	                l++; 
	            } 
	        } 
	    } 

	public static void main(String[] args) {
		   // initialize here.
	       int row, col, i, j;
	       int arr[][] = new int[10][10];
	       Scanner scan = new Scanner(System.in);
		   
	       // enter row and colurown for array.
	       System.out.print("Enter row for the array : ");
	       row = scan.nextInt();
	       System.out.print("Enter colurown for the array : ");
	       col = scan.nextInt();
		   
	       // enter array elerowents.
	       System.out.println("Enter " +(row*col)+ " Array Elerowents : ");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               arr[i][j] = scan.nextInt();
	           }
	       }
		   // Logic goes here
	       
	       /*
	        *  1, 2, 3 
	        *  4, 5, 6
	        *  7, 8, 9
	        *  
	        * 
	        * 
	        */
	       
	       
	       PrintSpiralArray.spiralPrint(row,col,arr);
	       
	       // the 2D array is here.
	       System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(arr[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	   }
	}
						
					
				

