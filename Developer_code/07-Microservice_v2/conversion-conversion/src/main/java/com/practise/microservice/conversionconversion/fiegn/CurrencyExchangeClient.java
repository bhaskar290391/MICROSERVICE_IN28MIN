package com.practise.microservice.conversionconversion.fiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practise.microservice.conversionconversion.model.CurrencyConversion;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeClient {

	@GetMapping("/currency-exchanges/from/{from}/to/{to}")
	public CurrencyConversion retrieveCurrencyExchangeData(@PathVariable String from, @PathVariable String to);
}
