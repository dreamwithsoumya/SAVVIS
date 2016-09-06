package com.teksystems.savvis.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.teksystems.savvis.Tester;

public class TestQATester {
Tester tester;

@Test
public void testQATester_ReturnNewObject() {
	tester = new Tester();
	Assert.assertNotNull("tester object is not null",tester);
}
	
	@Test
	public void getAllocation_oneTesterShouldReturn500(){
		
		tester = new Tester();
		 Assert.assertEquals("acclocation for the tester will be 500",tester.allocation(),BigDecimal.valueOf(500));
		
	}

}
