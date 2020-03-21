package com.arpit.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserVehicle {
	@Id @GeneratedValue
	private int personId;
	private String personName;
	
	@OneToMany(mappedBy = "user")
	
	private List<Vehicle> veh = new ArrayList<>();
	
	
	public List<Vehicle> getVeh() {
		return veh;
	}
	public void setVeh(List<Vehicle> veh) {
		this.veh = veh;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
