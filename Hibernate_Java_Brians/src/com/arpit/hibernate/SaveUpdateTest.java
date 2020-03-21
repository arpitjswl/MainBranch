package com.arpit.hibernate;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveUpdateTest {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sess = sf.openSession();;
		try {
			
			
			
			sess.beginTransaction();
			
			
			Customer cust = new Customer();
			cust.setPAN_CARD("ATXPJ6764G");
			cust.setPassport("N8880417");
			
			
			Akshay akshay = new Akshay();
			akshay.setId(cust);
			
			akshay.setLocation("Delhi");
			
			
			sess.save(akshay);
			
			
			sess.getTransaction().commit();
			
			
			
			sess.close();
			
			
			
			
			
		
			
			
		
		}
		catch (HibernateException e) {
			sess.getTransaction().rollback();
			e.printStackTrace();
		}
		
	

	}

}
