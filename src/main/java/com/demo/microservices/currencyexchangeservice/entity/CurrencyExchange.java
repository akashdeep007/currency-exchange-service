package com.demo.microservices.currencyexchangeservice.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CurrencyExchange {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private String enviroment;

	public CurrencyExchange() {

	}

	public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviorment) {
		this.enviroment = enviorment;
	}

}
