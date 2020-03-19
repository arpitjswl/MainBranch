package com.arpit.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue
	@Column(name = "USER_ID")
	private int userId;
	@Transient
	private String userName;
	@Temporal (TemporalType.DATE)
	private Date joinedDate;
	@Lob
	private String address;
	
	public UserDetails() {
		
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", joinedDate=" + joinedDate + ", address="
				+ address + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	

	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
