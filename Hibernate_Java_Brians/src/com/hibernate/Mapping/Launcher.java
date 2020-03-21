package com.hibernate.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.series.Arpit;
import com.hibernate.series.CollectionAddress;

public class Launcher {

	public static void main(String[] args) {

		
		
		
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
	
		
		
		
		Man man =  new Man();
		man.setName("Anuj");
		
		
		
		
		Car car = new Car();
		car.setCarName("Audi");
		car.setMan(man);
		
		
		Car car1 = new Car();
		car1.setCarName("Scorpio");
		car1.setMan(man);
		
		
		
		
		man.getCollection().add(car);
		man.getCollection().add(car1);
		sess.save(man);
		sess.save(car);
		sess.save(car1);
		
		
		
		
		sess.getTransaction().commit();
		
		
		
		sess.close();
		

		


	
	


	}

}
