package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P23 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point we = driver.findElement(By.name("login")).getLocation();
		System.out.println("X-axis of login button is "+we.getX());
		System.out.println("Y-axis of login button is "+we.getY());
		driver.close();
	}
}
             