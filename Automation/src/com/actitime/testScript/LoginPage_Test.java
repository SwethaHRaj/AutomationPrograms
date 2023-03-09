package com.actitime.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.LoginPage_POM;

public class LoginPage_Test {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void ValidLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		LoginPage_POM l=new LoginPage_POM(driver);
		l.setLogin("admin", "manager");
	}
	
	
}
