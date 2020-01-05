package com.arpit.hibernate.TeluskoHibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class LauncherMapping {

	public static void main(String[] args) {
		 Configuration cfg=null;
		 SessionFactory factory=null;
     	  Session ses=null;
     	  Transaction tx=null;
     	  
     	  Student s = new Student();
     	  s.setMarks(80);
     	  s.setName("Anshul");
     	  s.setRollNo(4661408);
     	  
     	  
     	  Laptop laptop = new Laptop();
     	  laptop.setLid(9104);
     	  laptop.setName("Acer");
     	  s.getLaptop().add(laptop);
     	  
     	  
     	  laptop.setStud(s);
     	  //s.getLaptop().add(laptop);
     	  
     		cfg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    		factory=cfg.buildSessionFactory();
    		ses=factory.openSession();
    		ses.beginTransaction();
    		
    		ses.save(laptop);
    		ses.save(s);
    		
    		ses.getTransaction().commit();
    		factory.close();

	}

}
