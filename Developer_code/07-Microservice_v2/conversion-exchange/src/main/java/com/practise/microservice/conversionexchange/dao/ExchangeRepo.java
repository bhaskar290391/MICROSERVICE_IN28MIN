package com.practise.microservice.conversionexchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.microservice.conversionexchange.model.CurrencyExchange;

public interface ExchangeRepo extends JpaRepository<CurrencyExchange, Long> {

	CurrencyExchange findByCurrencyFromAndCurrencyTo(String from,String to);
}
