package com.arpit.hibernate.HibernateMaven;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Arpit {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;
	
	@OneToMany(mappedBy = "arpit", cascade = CascadeType.ALL)
	private List<Car> list = new LinkedList<Car>();
	
}
