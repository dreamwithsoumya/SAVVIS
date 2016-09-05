package com.teksystems.savvis;

import java.math.BigDecimal;

public class Tester extends People{
	
	private final static BigDecimal allocation = new BigDecimal("500");
	
	public Tester() {
		super();
	}

	@Override
	public void add(People people) {
		
	}

	@Override
	public BigDecimal allocation() {
		return Tester.allocation;
	}

}
