package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P79 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException{   
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Demo78.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(driver.findElement(By.id("f1")));
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame("f1");
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(1000);
		driver.close();
	}
}

