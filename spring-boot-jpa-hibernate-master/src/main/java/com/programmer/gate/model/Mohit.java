package com.programmer.gate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Mohit {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "mohit")
	List<GirlFriends> list = new ArrayList<GirlFriends>();
	
	public Mohit(Long id, String name, List<GirlFriends> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
