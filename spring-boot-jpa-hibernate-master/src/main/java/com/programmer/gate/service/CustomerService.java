package com.programmer.gate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.gate.model.Player;
import com.programmer.gate.repository.CustomerDao;

@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	
	@Transactional
	public List<Player> getAllCustomers() {
		return customerDao.getAllCustomers();
	}
}
