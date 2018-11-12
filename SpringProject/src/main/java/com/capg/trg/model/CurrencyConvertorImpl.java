package com.capg.trg.model;

public class CurrencyConvertorImpl implements ICurrencyConvertor 
{
	private double exchangeRate;
	
	
	
	public CurrencyConvertorImpl() 
	{
		
	}

	

	public CurrencyConvertorImpl(double exchangeRate) 
	{
		super();
		this.exchangeRate = exchangeRate;
	}

	

	public double getExchangeRate() {
		return exchangeRate;
	}



	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}



	@Override
	public double dollarToRupees(double dollars) 
	{	
		return dollars*this.exchangeRate;
	}

}
