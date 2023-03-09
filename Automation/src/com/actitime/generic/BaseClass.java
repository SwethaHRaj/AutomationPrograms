package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}                                                     
	
	WebDriver driver;
	DataDriven d=new DataDriven();
	
	@BeforeClass
	public void openBrowser() throws IOException{
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.get(d.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
		driver.findElement(By.id("username")).sendKeys(d.getPropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(d.getPropertyData("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
