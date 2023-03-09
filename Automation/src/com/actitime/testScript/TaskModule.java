package com.actitime.testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass {
	
	@Test
	public void createTask() {
		Reporter.log("CreateTask",true);
	}
	
	@Test
	public void modifyTask() {
		Reporter.log("ModifyTask",true);
	}
	
	@Test
	public void deleteTask() {
		Reporter.log("DeleteTask",true);
		Assert.fail();
	}
}
