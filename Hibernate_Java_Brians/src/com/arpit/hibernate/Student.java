package com.arpit.hibernate;



import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	@AttributeOverride(name="firstName", column=@Column(name="f_name"))
	private Person id;
	
	@Column(name="location")
	private String location;
	
	public Student(Person id, String location){
		this.id=id;
		this.location=location;
	}
	public Person getId() {
		return id;
	}
	public void setId(Person id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
