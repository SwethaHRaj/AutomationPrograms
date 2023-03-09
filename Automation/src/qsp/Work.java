package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work{
	
	static {
		System.setProperty("wbdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("passContainer"));
		System.out.println(un.getRect().getHeight()+" "+un.getSize().getWidth());
		System.out.println(pwd.getRect().getHeight()+" "+pwd.getRect().getWidth());
		
		
	}                                     
}  