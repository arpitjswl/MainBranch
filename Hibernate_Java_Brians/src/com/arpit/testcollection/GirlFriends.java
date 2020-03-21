package com.arpit.testcollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GirlFriends {
	@Id @GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;
	private String gfName;
	private String gfCity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGfName() {
		return gfName;
	}
	public void setGfName(String gfName) {
		this.gfName = gfName;
	}
	public String getGfCity() {
		return gfCity;
	}
	public void setGfCity(String gfCity) {
		this.gfCity = gfCity;
	}
	
}
