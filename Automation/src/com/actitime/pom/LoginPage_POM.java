package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM {
	
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwdTB;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginB;
	
	public LoginPage_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String un,String pwd) {
		unTB.sendKeys(un);
		pwdTB.sendKeys(pwd);
		loginB.click();
	}
	
}
