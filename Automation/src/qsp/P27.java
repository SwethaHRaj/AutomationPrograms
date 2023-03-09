package qsp;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P27 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	    WebElement we = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		System.out.println("font-size is "+we.getCssValue("font-size")+"\nfont-family is "+we.getCssValue("font-family"));
		driver.close();
	}
}
             