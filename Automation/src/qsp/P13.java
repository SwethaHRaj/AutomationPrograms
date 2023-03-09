package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(res)
			System.out.println("Facebook logo is displaying");
		else
			System.out.println("Facebook logo is not displaying");
		driver.close();
	}
}
