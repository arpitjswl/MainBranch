package com.arpit.hibernate.HibernateMaven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String carName;
	@ManyToOne
	private Arpit arpit;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Arpit getArpit() {
		return arpit;
	}
	public void setArpit(Arpit arpit) {
		this.arpit = arpit;
	}
	
	
}
