package com.synechron.java;

import java.util.ArrayList;

// Practise Set 2 ques 3


class CreateCustomArrayList{
	int size = 5;
	
	class Employee{
		int empId;
		String name;
		public Employee(int empId, String name) {
			super();
			this.empId = empId;
			this.name = name;
		}
	}
	public void add(int empId[], String empName[]) {
		ArrayList<Employee> arrList = new ArrayList<Employee>();
		for (int i = 0; i < size; i++)
			arrList.add(new Employee(empId[i], empName[i]));
		print(arrList);
	}
	
	
	 public void print(ArrayList<Employee> aList) {
	      for (int i = 0; i < size; i++) {
	         Employee obj = aList.get(i);
	         System.out.println("Employee Id: " + obj.empId);
	         System.out.println("Employee Name: " + obj.name);
	      }
}

public static class CustomArrayList {

	public static void main(String[] args) {
		int empId[] =  {101, 102, 103, 104, 105};
		String empName[] =  {"Arpit", "Anuj", "Ankur", "Mohit", "Nimisha"};
		
		CreateCustomArrayList list = new CreateCustomArrayList();
		list.add(empId, empName);
		
	}
  }
}
