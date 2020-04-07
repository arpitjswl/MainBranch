package com.arpit.webservices.RestWebServices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(value = "/hello")
	public HelloWorldObject returnString() {
		return new HelloWorldObject("Messgae Default");
	}
	
	@RequestMapping(value = "/hello/{path}")
	public HelloWorldObject pathReturn(@PathVariable String path) {
		return new HelloWorldObject(path);
	}
}
