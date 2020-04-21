package com.synechron.datastructures.strings;

import java.util.Arrays;
import java.util.Scanner;

class CompareString { 

	static boolean areAnagram(char[] str1, char[] str2) 
	{ 
		// Get lenghts of both strings 
		int n1 = str1.length; 
		int n2 = str2.length; 

		// If length of both strings is not same, 
		// then they cannot be anagram 
		if (n1 != n2) 
			return false; 

		// Sort both strings 
		Arrays.sort(str1); 
		Arrays.sort(str2); 

		// Compare sorted strings 
		for (int i = 0; i < n1; i++) 
			if (str1[i] != str2[i]) 
				return false; 

		return true; 
	} 

	/* Driver program to test to print printDups*/
	public static void main(String args[]) 
	{ 
		Scanner scObj = new Scanner(System.in);
		String str1 = null;
		String str2 = null;
		System.out.println("Enter first String : ");
		str1 = scObj.next();
		System.out.println("Enter Second String : ");
		str2 = scObj.next();
		
		char charStr1[] = str1.toCharArray(); 
		char charStr2[] = str2.toCharArray(); 
		if (areAnagram(charStr1, charStr2)) 
			System.out.println("String are" + " anagram of each other"); 
		else
			System.out.println(" are not" + " anagram of each other"); 
	} 
}  
