package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P77 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {   
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://vtiger.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"))).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		a.doubleClick(driver.findElement(By.id("loginspan"))).perform();
		if(driver.getTitle().equals("Login - Vtiger")) 
			System.out.println("Login page displayed");
		else
			System.out.println("Login page not displayed");
		driver.close();
	}
}

