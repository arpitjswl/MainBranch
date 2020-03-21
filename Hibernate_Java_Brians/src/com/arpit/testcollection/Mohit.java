package com.arpit.testcollection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Mohit {
	@Id @GeneratedValue 
	private int id;
	private String name;
	// Cascade Type all means than an association with another Entity need not Save
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name = "bfId")
	@ElementCollection
	private List<GirlFriends> list = new ArrayList<GirlFriends>();
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
	public List<GirlFriends> getList() {
		return list;
	}
	public void setList(List<GirlFriends> list) {
		this.list = list;
	}
	
}
