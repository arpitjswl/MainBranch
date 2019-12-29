package com.arpit.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;

import com.arpit.hibernate.entity.Student;
import com.mysql.cj.xdevapi.SessionFactory;

public class CreateStudent {
	public static void main (String args[]){
		
		// create SessionFactory
		
		org.hibernate.SessionFactory sessFacObj =  new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class).buildSessionFactory();
		
		// create Session
		
		Session session =  sessFacObj.getCurrentSession();
		
		try{
			// create Student object
			System.out.println("Creating new Student object");
			Student studObj = new Student("Nidhi", "Jaiswal", "jswl.arpit@gmail.com");
			
			session.beginTransaction();
			
			//Save the Student object
			System.out.println("Saving Student object");
			session.save ( studObj );
			
			session.getTransaction().commit();
			
			System.out.println("Finally Done");
			
		}
		
		finally{
			sessFacObj.close();
		}
	}
}
