package com.practise.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.limitservice.config.LimitConfiguration;
import com.practise.microservice.limitservice.model.Limits;

@RestController
public class LimitController {

	private LimitConfiguration configuration;

	public LimitController(LimitConfiguration configuration) {
		super();
		this.configuration = configuration;
	}
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
