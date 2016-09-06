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
		Assert.assertNotNull("developer object is not null",developer);
	}
	
	@Test
	public void getAllocation_oneDeveloperShouldReturn1000(){
		
		developer = new Developer();
		 Assert.assertEquals("acclocation for the developer will be 1000",developer.allocation(),BigDecimal.valueOf(1000));
		
	}
	
}
