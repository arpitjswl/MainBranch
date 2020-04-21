package com.synechron.datastructures.stack;

import java.util.Stack;

class MyStack 
{ 
	Stack<Integer> s; 
	Integer minEle; 
 
	MyStack() { s = new Stack<Integer>(); } 
	
	void getMin() 
	{  
		if (s.isEmpty()) 
			System.out.println("Stack is empty"); 
		else
			System.out.println("Minimum Element in the " + 
							" stack is: " + minEle); 
	} 
	void peek() 
	{ 
		if (s.isEmpty()) 
		{ 
			System.out.println("Stack is empty "); 
			return; 
		} 

		Integer t = s.peek(); // Top element. 

		System.out.print("Top Most Element is: "); 

		if (t < minEle) 
			System.out.println(minEle); 
		else
			System.out.println(t); 
	} 

	// Removes an element
	void pop() 
	{ 
		if (s.isEmpty()) 
		{ 
			System.out.println("Stack is empty"); 
			return; 
		} 

		System.out.print("Top Most Element Removed: "); 
		Integer t = s.pop(); 

		// Minimum will change as the minimum element 
		// of the stack is being removed. 
		if (t < minEle) 
		{ 
			System.out.println(minEle); 
			minEle = 2*minEle - t; 
		} 

		else
			System.out.println(t); 
	} 

	// Push a data in Stack 
	void push(Integer x) 
	{ 
		if (s.isEmpty()) 
		{ 
			minEle = x; 
			s.push(x); 
			System.out.println("Number Inserted: 1st " + x); 
			return; 
		} 
 
		if (x < minEle) 
		{ 
			System.out.println("val" +(2*x - minEle));
			s.push(2*x - minEle); 
			minEle = x; 
		} 

		else
			s.push(x); 

		System.out.println("Number Inserted: " + x); 
	} 
}; 

//Driver Code 
public class GetMinConstantTime 
{ 
	public static void main(String[] args) 
	{ 
		MyStack s = new MyStack(); 
		s.push(30); 
		s.push(15); 
		s.getMin(); 
		s.push(12); 
		s.push(1); 
		s.getMin(); 
		s.pop(); 
		s.getMin(); 
		s.pop(); 
		s.peek(); 
	} 
} 
