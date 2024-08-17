package com.practise.microservice.conversionexchange.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	

	@GetMapping("/sampleApi")
	//@Retry(name = "sampleApi",fallbackMethod = "hardCodedResponse")
	//@CircuitBreaker(name = "default",fallbackMethod = "hardCodedResponse")
	//@RateLimiter(name = "default")
	@Bulkhead(name="/sampleApi")
	public String getSampleApi() {
		System.out.println("inside sample API -->");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8779/dummy-api", String.class);
		return forEntity.getBody();
	}
	
	
	public String hardCodedResponse(Exception exceptiopn) {
		return "bhaskar falback reponse";
	}
}
