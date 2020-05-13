package com.programmer.gate.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.programmer.gate.model.Player;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public List<Player> getAllCustomers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Player>  customerList = session.createQuery("from Player").list();
		return customerList;
		
	}

}
