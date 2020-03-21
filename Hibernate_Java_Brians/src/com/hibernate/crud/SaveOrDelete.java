package com.hibernate.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.NamedQuery;


@Entity
@NamedQuery(name = "queryById", query = " from SaveOrDelete where userId = ?")
public class SaveOrDelete {
	@Id @GeneratedValue
	private int userId;
	private String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
