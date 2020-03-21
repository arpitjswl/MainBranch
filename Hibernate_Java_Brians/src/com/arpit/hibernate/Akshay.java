package com.arpit.hibernate;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Akshay implements Serializable{
	@EmbeddedId
	private Customer id;
	private String location;
	public Customer getId() {
		return id;
	}
	public void setId(Customer id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
