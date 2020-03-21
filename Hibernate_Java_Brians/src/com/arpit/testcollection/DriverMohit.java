package com.arpit.testcollection;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.answers.Answer;
import com.hibernate.answers.Question;

public class DriverMohit {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
	  
	
		   Mohit mohit = new Mohit();
		   mohit.setName("Mohit");
		   
	    GirlFriends gf = new GirlFriends();
	    gf.setGfName("Apurva Shetty");
	    gf.setGfCity("Nagpur");
	        
	    
	    GirlFriends gf2 = new GirlFriends();
	    gf2.setGfName("Nimisha");
	    gf2.setGfCity("Vikas Nagar Nagpur");
	    
	    mohit.getList().add(gf);
	    mohit.getList().add(gf2);
	    
		sess.save(mohit);
		sess.getTransaction().commit();
		
		
		Query query = sess.createQuery("from Mohit");
		List<Mohit> listNew = (List<Mohit>)query.list();
		
		Iterator<Mohit> itr = listNew.iterator();
		
		while (itr.hasNext()) {
			Mohit mohit4 = 	itr.next();
		System.out.println("BF name : " +mohit.getName());
		
			List<GirlFriends> listB = mohit4.getList();
			Iterator<GirlFriends> newListY = listB.iterator();
			
			while (newListY.hasNext()) {
				GirlFriends gfNew = newListY.next();
				System.out.println("Girl Friends Name : " +gfNew.getGfName());
			}
		
		}
		
		
		
		sess.close();
		
		
		
		

	

	}

}
