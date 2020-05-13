package com.programmer.gate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.programmer.gate.model.GirlFriends;
import com.programmer.gate.model.Player;
import com.programmer.gate.service.CustomerService;

@Controller
public class MainController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/getAllTeamsData", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllCustomers(Model model) {

		List<Player> listOfCustomers = customerService.getAllCustomers();
		model.addAttribute("customer", new Player());
		model.addAttribute("listOfCustomers", listOfCustomers);
		return "customerDetails";
	}
}
