package com.sowmya.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sowmya.microservices.limitsservice.configuration.Configuration;
import com.sowmya.microservices.limitsservice.model.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration config;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(config.getMinimum(), config.getMaximum());
	}
}
