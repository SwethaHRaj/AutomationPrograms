package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement res = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println("Tag Name is "+res.getTagName());
		System.out.println("Attribute value of href is "+res.getAttribute("href"));
		driver.close();
	}
}
