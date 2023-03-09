package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P74 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {   
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://vtiger.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"))).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String pn = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(pn);
		driver.close();
	}
}

