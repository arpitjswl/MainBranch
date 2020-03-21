package com.arpit.hibernate;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Embeddable

public class Customer implements Serializable{
	

	private String PAN_CARD;
	private String passport;

	public String getPAN_CARD() {
		return PAN_CARD;
	}
	public void setPAN_CARD(String pAN_CARD) {
		PAN_CARD = pAN_CARD;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
}
