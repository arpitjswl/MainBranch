package com.arpit.hibernate.HibernateMaven;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import oracle.net.aso.q;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Getting data from get Method
		/*
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * Session sess = sf.openSession(); sess.beginTransaction();
		 * 
		 * 
		 * 
		 * for (int i = 0; i <= 10; i ++) { EmployeeData user = new EmployeeData();
		 * user.setName("User " + i); sess.save(user);
		 * 
		 * }
		 * 
		 * 
		 * sess.getTransaction().commit(); sess.close();
		 * 
		 * sess = sf.openSession(); sess.beginTransaction(); EmployeeData obj = null;
		 * obj = (EmployeeData)sess.get(EmployeeData.class, 1);
		 * System.out.println(obj.getName());
		 */

		/*
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * Session sess = sf.openSession(); sess.beginTransaction();
		 * 
		 * 
		 * 
		 * 
		 * EmployeeData user = new EmployeeData(); user.setName("User 10" ); Address
		 * address = new Address(); address.setCity("Nagpur2" ); address.setState("MH2"
		 * ); user.getAddress().add(address); sess.save(user);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * sess.getTransaction().commit(); sess.close();
		 * 
		 * sess = sf.openSession(); sess.beginTransaction(); EmployeeData obj = null;
		 * obj = (EmployeeData)sess.get(EmployeeData.class, 1);
		 * System.out.println(obj.getName());
		 */

		// HQL Starts here
		/*
		 * SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 * Session sess = sf.openSession(); sess.beginTransaction();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * for (int i = 1; i <= 10; i++) { ClienData obj = new ClienData();
		 * obj.setClientName("Client" + i); sess.save(obj); }
		 * 
		 * 
		 * org.hibernate.query.Query query =
		 * sess.createQuery(" from ClienData where client_id > :name");
		 * 
		 * query.setParameter("name", 5); List<ClienData> list = (List)query.list();
		 * 
		 * for (ClienData data : list) { System.out.println(data.getClientName()); }
		 * 
		 * sess.getTransaction().commit(); sess.close();
		 */

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        
        Arpit arpitObj = new Arpit();
        arpitObj.setName("Arpit");

        Car car = new Car();
        car.setCarName("BMW");
        	
        Car car1 = new Car();
        car1.setCarName("Ferrari");
        System.out.println("GOT!!!!" +arpitObj.getList());
        arpitObj.getList().add(car);
        arpitObj.getList().add(car1);
        
        sess.save(arpitObj);
        
        
        
        sess.getTransaction().commit();
        sess.close();
      

	}
}
