package com.synechron.insurance.Buy.Insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id @GeneratedValue
	@Column(name = "cust_id")
	private Integer id;
	@Column(name = "first_name", nullable = false)
	private String fName;
	@Column(name = "last_name")
	private String lName;
	@Column(name = "cust_contact")
	private Long contact;
	protected Customer() {}
	public Customer(String fName, String lName, Long contact) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
	}
	public Integer getId() {
		return id;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public Long getContact() {
		return contact;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fName=" + fName + ", lName=" + lName + ", contact=" + contact + "]";
	}
}
