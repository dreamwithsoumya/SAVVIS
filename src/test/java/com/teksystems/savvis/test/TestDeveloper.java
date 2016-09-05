package com.teksystems.savvis.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.teksystems.savvis.Developer;


public class TestDeveloper {
	
	Developer developer;
	
	@Test
	public void testDeveloper_ReturnNewObject() {
		developer = new Developer();
		Assert.assertNotNull(developer);
	}
	
	@Test
	public void getAllocation_oneDeveloperShouldReturn1000(){
		
		developer = new Developer();
		 Assert.assertEquals(developer.allocation(),BigDecimal.valueOf(1000));
		
	}
	
}
