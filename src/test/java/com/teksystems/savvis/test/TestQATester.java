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
	Assert.assertNotNull(tester);
}
	
	@Test
	public void getAllocation_oneTesterShouldReturn500(){
		
		tester = new Tester();
		 Assert.assertEquals(tester.allocation(),BigDecimal.valueOf(500));
		
	}

}
