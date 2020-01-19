package com.arpit.basics;

interface I1{
	public void getData();
}




public class InterfaceDemo implements I1{

	public static void main (String args[]) {
		I1 obj = new InterfaceDemo();
		obj.getData();
		new InterfaceDemo().classMethod();
	}
	
	@Override
	public void getData() {
		System.out.println("In InterfaceDemo getData() ");
		
	}
	
	public void classMethod() {
		System.out.println("In classMethod");
	}
	
}
