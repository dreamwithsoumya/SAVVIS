package com.teksystems.savvis;

import java.math.BigDecimal;

public class Developer extends People{
	private final static BigDecimal allocation = new BigDecimal("1000");
	
	public Developer() {
		super();
	}

	@Override
	public void add(People people) {
		
	}


	@Override
	public BigDecimal allocation() {
		return Developer.allocation;
	}

}
