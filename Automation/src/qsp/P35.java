package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class P35 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("(//button)[2]")).click();
		 driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone 14pro max");
		 driver.findElement(By.tagName("svg")).click();
		 Thread.sleep(10000);
		 List<WebElement> name = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		 List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
		 
		 int count = name.size(); 
		 for(int i=0;i<count;i++)
			 System.out.println(name.get(i).getText()+" ---> "+price.get(i).getText());	 
		 driver.close();
		 
	}

} //ty
