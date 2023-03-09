package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20{
	
	static {
		System.setProperty("wbdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("loginButton")).click();
	}                                     
}  