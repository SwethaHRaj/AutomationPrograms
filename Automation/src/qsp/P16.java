package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P16 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String res = driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		System.out.println(res);
		driver.close();
	}

	
	
}
