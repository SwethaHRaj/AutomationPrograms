package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P42 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select sd=new Select(day);
		sd.selectByValue("4");
		
		WebElement month = driver.findElement(By.id("month"));
		Select sm=new Select(month);
		sm.selectByIndex(2);
		
		WebElement year = driver.findElement(By.id("year"));
		Select sy=new Select(year);
		sy.selectByVisibleText("1992");

	}

}
