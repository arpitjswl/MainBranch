package com.hibernate.crud;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Mapping.Car;
import com.hibernate.Mapping.Man;

public class DriverClass {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		String sqlData = "First No8";
		int data = 8;
	
		
		
		Criteria criteria = sess.createCriteria(SaveOrDelete.class);
		criteria.add(Restrictions.gt("email", 5));
		
		List<SaveOrDelete> list = (List<SaveOrDelete>)criteria.list();
		
		
		sess.getTransaction().commit();
		
		sess.close();
		
		
		for (SaveOrDelete obj : list) {
			System.out.println(obj.getEmail());
			
		}
		
		
		
		
		

	}

}
