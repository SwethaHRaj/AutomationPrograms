package com.actitime.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.generic.DataDriven;

public class DataDrivenImp {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test(enabled=false)
	public void test() throws IOException{
		WebDriver driver=new ChromeDriver();
		DataDriven d=new DataDriven();
		String url=d.getPropertyData("url");
		driver.get(url);
		String un=d.getPropertyData("username");
		driver.findElement(By.id("username")).sendKeys(un);
		String pwd=d.getPropertyData("password");
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		// read and write to excel ....to be continued
	}
}
