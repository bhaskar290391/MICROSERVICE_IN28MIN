package com.practise.microservice.conversionconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConversionConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionConversionApplication.class, args);
	}

}
