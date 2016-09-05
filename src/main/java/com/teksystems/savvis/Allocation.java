package com.teksystems.savvis;

import java.math.BigDecimal;

public class Allocation {
	private People people;
	
	public Allocation(People people){
		super();
		this.people = people;
	}
	
	public BigDecimal getAllocation() {
		return people.allocation();
	}

}
