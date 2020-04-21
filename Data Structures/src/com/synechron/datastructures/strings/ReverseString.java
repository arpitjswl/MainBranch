package com.synechron.datastructures.strings;

import java.util.Scanner;


public class ReverseString {
	public static void main (String args[]) {
		String input = null;
		char arr[] = {};
		int index = 0;
		String reverse = "";
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter a String to reverse : ");
		input = scObj.next();
		arr = input.toCharArray();
		System.out.println("Enetered String : "+input);
		
		int arrLength = arr.length;
		for (index = arrLength - 1; index >= 0; index--) {
			reverse = reverse + input.charAt(index);
		}
		
		System.out.println(reverse);
		
	}
}

