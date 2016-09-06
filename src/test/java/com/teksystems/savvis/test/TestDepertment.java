package com.teksystems.savvis.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.teksystems.savvis.Depertment;
import com.teksystems.savvis.Manager;

public class TestDepertment {
	
	Depertment depertment;
	
	@Test
	public void testDepertment_shouldReturnNewObject() {
		depertment = new Depertment();
		Assert.assertNotNull("depertment object is not null",depertment);
	}
	
	@Test
	public void getAllocation_whenDepartmentHasTwoManagers_shouldReturn_600() {
		depertment = new Depertment();
		depertment.add(new Manager());
		depertment.add(new Manager());
		Assert.assertEquals("Total allocation for the depertment will be 600",depertment.allocation(),BigDecimal.valueOf(600));
	}

}
