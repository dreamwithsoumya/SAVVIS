package com.teksystems.savvis.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.teksystems.savvis.Manager;

public class TestManager {
	
Manager manager;

@Test
public void testMAnager_ReturnNewObject() {
	manager = new Manager();
	Assert.assertNotNull("manager object is not null",manager);
}
	
	@Test
	public void getAllocation_oneManagerShouldReturn300(){
		
		manager = new Manager();
		 Assert.assertEquals("acclocation for the manager will be 300",manager.allocation(),BigDecimal.valueOf(300));
		
	}

}
