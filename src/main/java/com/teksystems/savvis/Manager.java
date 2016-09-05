package com.teksystems.savvis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Manager extends People{
	
	private final static BigDecimal allocation = new BigDecimal("300");
	private List<People> people = new ArrayList<People>();

	
	public Manager() {
		super();
	}

	@Override
	public void add(People p) {
		people.add(p);
	}

	@Override
	public BigDecimal allocation() {
		BigDecimal allocation = Manager.allocation;
		for(People p: people) {
			allocation = allocation.add(p.allocation());
		}
		return allocation;
	}

}
