package com.practise.microservice.conversionconversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.conversionconversion.fiegn.CurrencyExchangeClient;
import com.practise.microservice.conversionconversion.model.CurrencyConversion;

@RestController
public class ConversionController {

	@Autowired
	private CurrencyExchangeClient client;
	
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion conversion(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {

		CurrencyConversion currencyExchangeData = client.retrieveCurrencyExchangeData(from, to);
	
		return new CurrencyConversion(currencyExchangeData.getId(), from, to, currencyExchangeData.getConversionMultiple(),
				quantity, quantity.multiply(currencyExchangeData.getConversionMultiple()), currencyExchangeData.getEnvironment());
	}
}
