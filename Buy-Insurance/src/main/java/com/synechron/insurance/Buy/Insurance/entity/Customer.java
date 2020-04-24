package com.synechron.insurance.Buy.Insurance.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.IndexColumn;

@Entity
public class Customer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Integer id;
	
	@Column(name = "first_name", nullable = false)
	private String fName;
	
	@Column(name = "last_name")
	private String lName;
	
	@Column(name = "customer_age")
	private Integer age;
	
	@Column(name = "cust_contact")
	private Long contact;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name = "CUSTOMER_ID") ,
	inverseJoinColumns = @JoinColumn(name = "PLAN_ID"), 
	name = "Customer_Plan")
	private List<Plans> list = new ArrayList<>();
	
	protected Customer() {}
	public Customer(String fName, String lName, Integer age, Long contact, List<Plans> list) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
		this.age = age;
		this.list = list;
	}
	
	public List<Plans> getList() {
		return list;
	}
	public void setList(List<Plans> list) {
		this.list = list;
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
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", contact=" + contact
				+ "]";
	}
	
}
