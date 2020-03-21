package com.hibernate.Mapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserCar")
public class Man {
	@Id @GeneratedValue
	private int userName;
	private String name;
	
	@OneToMany(mappedBy = "man")
	private Collection<Car> collection = new ArrayList<>();
	
	
	public Collection<Car> getCollection() {
		return collection;
	}
	public void setCollection(Collection<Car> collection) {
		this.collection = collection;
	}
	public int getUserName() {
		return userName;
	}
	public void setUserName(int userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
