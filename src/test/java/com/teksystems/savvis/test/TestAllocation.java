package com.teksystems.savvis.test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.teksystems.savvis.Allocation;
import com.teksystems.savvis.Developer;
import com.teksystems.savvis.Manager;
import com.teksystems.savvis.Tester;

public class TestAllocation {
	public Allocation allocation;
	
	@Test
	public void testAllocation_ReturnNewObject() {
		allocation = new Allocation(null);
		Assert.assertNotNull("allocation object is not null",allocation);
	}

	
	@Test
	public void getAllocation_ManagerHasOneReportingManagerAndTwoEmployees_Return_2100() {
		Manager managerA = new Manager();  // create a new Manager
		Manager managerB = new Manager();  // create a new Reporting Manager 
		BigDecimal expectedallocation = new BigDecimal("2100");
	
		managerB.add(new Tester());  // add tester to Reporting Manager
		managerB.add(new Developer()); // add Developer to Reporting Manager
		managerA.add(managerB);  // add Reporting manager to Manager
		
		
		
		allocation = new Allocation(managerA); // get allocation for Manager
		Assert.assertEquals("Manager will get 2100",allocation.getAllocation(),expectedallocation);
	}

}
