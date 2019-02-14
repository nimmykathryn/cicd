package com.cicd.cicdapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CicdappApplicationController {
	@RequestMapping(path="/greet",method=RequestMethod.GET)
	public String greet() {
		return "Welcome to Spring Boot";
	}
}
