package com.actitime.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionImp {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test(enabled=false)
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualTitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertNotSame(actualTitle,"Google");
		s.assertAll();
		driver.close();
	}
}
