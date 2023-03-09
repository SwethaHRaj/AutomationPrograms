package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
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

public class P68 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title of window to be closed");
		String closeWH = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> whs = driver.getWindowHandles();
		for(String wh:whs) {
			String title = driver.switchTo().window(wh).getTitle();
			if(title.contains(closeWH)==false) 
				driver.close();
		}
		}
}

//Sign in with Apple ID
//Facebook
