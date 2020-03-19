package com.arpit.hibernate;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CollectionMain {

	public static void main(String[] args) {
		
		Session sess = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			
			sess = sf.openSession();
			sess.beginTransaction();
			
			
			/*
			 * PersonDetails personNew = new PersonDetails();
			 * personNew.setUserName("Ayush");
			 * 
			 * Address address = new Address(); address.setCity("Nagpur");
			 * address.setStreet("main road"); address.setPIN("411033");
			 * address.setState("MP");
			 * 
			 * 
			 * personNew.getListOfAddress().add(address); sess.save(personNew);
			 */
			
			
			UserVehicle hasBoj = new UserVehicle();
			hasBoj.setPersonName("Vinay");
			
			Vehicle vehObj = new Vehicle();
			vehObj.setVehicleName("BMW");
			
			
			Vehicle vehObj1 = new Vehicle();
			vehObj1.setVehicleName("Toyota");
			hasBoj.getVeh().add(vehObj);
			hasBoj.getVeh().add(vehObj1);
			System.out.println(hasBoj.getVeh());
			vehObj.setUser(hasBoj);
			
			sess.save(hasBoj);
			sess.save(vehObj);
			sess.getTransaction().commit();
			
			
			
			
			sess.close();
			/*
			 * personNew = null; sess = sf.openSession(); personNew = (PersonDetails)
			 * sess.get(PersonDetails.class, 16);
			 * System.out.println(personNew.getListOfAddress().size());
			 */
			
			
			
			
			
			
			
			
		//	sess.close();
		}
		catch (HibernateException e) {
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
		
	

	}

}
