package com.practise.microservice.conversionexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practise.microservice.conversionexchange.dao.ExchangeRepo;
import com.practise.microservice.conversionexchange.model.CurrencyExchange;

@RestController
public class ExchangeController {

	@Autowired
	private ExchangeRepo repo;

	@Autowired
	private Environment env;

	@GetMapping("/currency-exchanges/from/{from}/to/{to}")
	public CurrencyExchange retrieveCurrencyExchangeData(@PathVariable String from, @PathVariable String to) {

		CurrencyExchange byCurrencyFromAndCurrencyTo = repo.findByCurrencyFromAndCurrencyTo(from, to);
		String property = env.getProperty("local.server.port");
		byCurrencyFromAndCurrencyTo.setEnvironment(property);
		return byCurrencyFromAndCurrencyTo;
	}
}
