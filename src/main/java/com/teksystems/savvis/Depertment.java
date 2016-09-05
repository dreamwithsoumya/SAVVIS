package com.teksystems.savvis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Depertment extends People{
	private List<People> people = new ArrayList<People>();
	
	public Depertment(){
		super();
	}


	@Override
	public void add(People p) {
		people.add(p);
		
	}


	@Override
	public BigDecimal allocation() {
		BigDecimal expenseAllocation = BigDecimal.ZERO;
		for (People p : people) {
		    expenseAllocation =  expenseAllocation.add(p.allocation());
		}
		return expenseAllocation;
	}

}
