package com.arpit.hibernate.HibernateMaven;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name =  "Client")
@Data
public class EmployeeData {
	@javax.persistence.Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String name;
	@ElementCollection
	@AttributeOverride(name = "city",
	column = @Column(name = "custom_city"))
	@JoinTable(name = "CUSTOMER_CITY")
	private Set<Address> address = new HashSet();
	
	
	/*
	 * public Set<Address> getAddress() { return address; }
	 * 
	 * public void setAddress(Set<Address> address) { this.address = address; }
	 * 
	 * 
	 * public int getUserId() { return userId; }
	 * 
	 * public void setUserId(int userId) { this.userId = userId; } public String
	 * getName() { return name; } public void setName(String name) { this.name =
	 * name; }
	 */
	
}
