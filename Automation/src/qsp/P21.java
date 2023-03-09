package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension we = driver.findElement(By.name("login")).getSize();
		System.out.println("Height of login button is "+we.getHeight());
		System.out.println("Width of login button is "+we.getWidth());
		driver.close();
	}
}
             