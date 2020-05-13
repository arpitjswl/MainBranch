package com.programmer.gate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GirlFriends {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "bf_id")
	private Mohit mohit;
	
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
	public Mohit getMohit() {
		return mohit;
	}
	public void setMohit(Mohit mohit) {
		this.mohit = mohit;
	}
	public GirlFriends(Long id, String name, Mohit mohit) {
		super();
		this.id = id;
		this.name = name;
		this.mohit = mohit;
	}
	
	
}
