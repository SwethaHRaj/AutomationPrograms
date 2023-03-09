package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		
		int un = driver.findElement(By.id("username")).getLocation().getX();
		int pwd = driver.findElement(By.name("pwd")).getLocation().getX();
		
		if(un==pwd)
			System.out.println("Username textbox and Password textox are aligned");
		else
			System.out.println("Username textbox and Password textox are not aligned");driver.close();
	}
}
             