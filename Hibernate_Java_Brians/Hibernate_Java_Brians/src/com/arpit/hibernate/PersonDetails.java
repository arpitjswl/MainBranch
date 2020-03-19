package com.arpit.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity(name = "USER_DATA")

public class PersonDetails {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection
	@JoinTable(name = "USER_ADDRESS",  
	joinColumns = @JoinColumn(name = "USER_ADDRESS")
	)
	//@CollectionId(columns)
	private Set<Address> listOfAddress = new HashSet<>();
	
	public int getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "PersonDetails [userId=" + userId + ", userName=" + userName + ", listOfAddress=" + listOfAddress + "]";
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set<Address> getListOfAddress() {
		return listOfAddress;
	}
	/*
	 * public void setListOfAddress(Set<Address> listOfAddress) {
	 * System.out.println(""); this.listOfAddress = listOfAddress; }
	 */
	
	
	
}
