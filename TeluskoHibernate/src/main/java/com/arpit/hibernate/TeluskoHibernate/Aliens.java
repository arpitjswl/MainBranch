package com.arpit.hibernate.TeluskoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

// POJO
@Entity
public class Aliens {
	@Id
	private int id;
	private String name;
	private String color;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	/*
	 * public String toString() { return "id : " + id + " Name : " +name +
	 * " Color : " + color + " Address" +address.getArea(); }
	 */
	
	
}		
