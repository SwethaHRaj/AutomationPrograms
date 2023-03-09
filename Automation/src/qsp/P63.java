package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P63 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {  //coninue
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> whs = driver.getWindowHandles();
		for(String i:whs)
		System.out.println(i);
		driver.quit();
		}
}
