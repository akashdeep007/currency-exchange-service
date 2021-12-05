package com.demo.microservices.currencyexchangeservice.controller;


@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) throws Exception

	{
		CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to);
		if (currencyExchange == null)
			throw new RuntimeException("No data found");
		currencyExchange.setEnviroment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}

}
