package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P75 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {   
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.contextClick(driver.findElement(By.linkText("actiTIME Inc."))).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}

