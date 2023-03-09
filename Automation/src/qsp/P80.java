package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class P80 {
	static {
		System.setProperty("webdriver.chrome.drive", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException{   
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Demo80.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		/*JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('t2').value='manager'");
							OR
		*/
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('t2').value='manager'");
		driver.close();
	}
}

