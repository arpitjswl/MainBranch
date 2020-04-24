package com.synechron.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

//Practise Set 2 ques 5

class Laptop {
	private String brand;
	private int price;
	private int ram;
	
	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}

		
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	
}


public class HashMapImpl {

	public static void main(String[] args) throws ClassNotFoundException {
				
		HashMap<String, String> codenames = new HashMap<String, String>();
		codenames.put("4", "Sparkler");
		codenames.put("6", "Playground");
		codenames.put("3", "Kestrel");
		codenames.put("8", "Merlin");
		codenames.put("1", "Tiger");
		codenames.put("2", "Mustang");
		codenames.put("9", "Dolphin");
		
		
		
		System.out.println("HashMap before sorting, random order Keys Sorted ");
		Set<Entry<String, String>> entries = codenames.entrySet();
		
		for (Entry<String, String> entry : entries) 
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		
		
			Comparator<Entry<String, String>> valueComparator = new Comparator<Entry<String,String>>()
			{ @Override public int compare(Entry<String, String> e1, Entry<String, String> e2) { 
		
				String v1 = e1.getValue(); 
				String v2 = e2.getValue();
				return v1.compareTo(v2); 
			} };

			

			// Sort method needs a List, so let's first convert Set to List in Java
			List<Entry<String, String>> listOfEntries = new ArrayList<Entry<String,
			 String>>(entries); // sorting HashMap by values using comparator
			Collections.sort(listOfEntries, valueComparator);
			
			System.out.println("listOfEntries" + listOfEntries);

			
			LinkedHashMap<String, String> sortedByValue = new LinkedHashMap<String, String>(listOfEntries.size());
			// copying entries from List to Map 
			
			for(Entry<String, String> entry : listOfEntries)
				sortedByValue.put(entry.getKey(), entry.getValue());

			System.out.println("HashMap after sorting entries by values "); 
			Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
			
			for(Entry<String, String> mapping : entrySetSortedByValue)
				System.out.println(mapping.getKey() + " ==> " + mapping.getValue());					
	}
}