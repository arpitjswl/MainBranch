package com.arpit.springmvc;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class Student {
	@Size(min = 2, max = 30)
	private String name;
	
	private String hobby;
	
	private Long mobile;
	private Date date;
	private List<String> skillsSet;
	
	private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getSkillsSet() {
		return skillsSet;
	}
	public void setSkillsSet(List<String> skillsSet) {
		this.skillsSet = skillsSet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
