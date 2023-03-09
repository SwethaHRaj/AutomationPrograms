package com.actitime.testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImp.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void createCustomer() {
		Reporter.log("CreateCustomer",true);
		Assert.fail();
	}
	
	/*
	@Test
	public void modifyCustomer() {
		Reporter.log("ModifyCustomer",true);
		
	}
	
	@Test
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer",true);
		Assert.fail();
	}
	*/
}
