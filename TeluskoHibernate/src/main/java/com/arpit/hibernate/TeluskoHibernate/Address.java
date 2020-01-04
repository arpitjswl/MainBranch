package com.arpit.hibernate.TeluskoHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String area;
	private String PIN;
	private String city;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPIN() {
		return PIN;
	}
	public void setPIN(String pIN) {
		PIN = pIN;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
