package com.dummy.Dummy;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id @GeneratedValue
	private Integer id;
	private String name;
	@OneToMany(mappedBy = "user")
	private List<Post> post;
	
	


	public List<Post> getPost() {
		return post;
	}


	public void setPost(List<Post> post) {
		this.post = post;
	}


	protected User() {}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
