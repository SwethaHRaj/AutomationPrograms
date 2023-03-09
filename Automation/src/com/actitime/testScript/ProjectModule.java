package com.actitime.testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	
	@Test
	public void createProject() {
		Reporter.log("CreateProject",true);
	}
	
	@Test
	public void modifyProject() {
		Reporter.log("ModifyProject",true);
	}
	
	@Test
	public void deleteProject() {
		Reporter.log("DeleteProject",true);
	}
}
