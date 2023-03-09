package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P25 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		int r1 = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).getLocation().getY();
		int r2 = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).getLocation().getY();
		int r3 = driver.findElement(By.xpath("(//input[@name='sex'])[3]")).getLocation().getY();
		if(r1==r2 && r2==r3)
			System.out.println("Radio buttons are aligned");
		else
			System.out.println("Radio buttons are not aligned");
		driver.close();
	}
}
             