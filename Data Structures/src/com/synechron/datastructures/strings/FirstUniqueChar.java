package com.synechron.datastructures.strings;
 
class FirstUniqueChar 
{ 
	// Driver method
	public static void main (String[] args) 
	{ 
		int i,j = 0;
		String input = "ArpitA";
		boolean isUnique = false;
		System.out.println("String is ::" +input);
		
		
		for (i = 0; i < input.length(); i++) {
			isUnique = true;
			for (j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println("The first non repeated character in String is: " + input.charAt(i));
				break;
			}
			
		}
		
	} 
} 
