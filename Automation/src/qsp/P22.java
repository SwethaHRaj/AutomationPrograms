package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Dimension un = driver.findElement(By.id("username")).getSize();
		Dimension pwd = driver.findElement(By.name("pwd")).getSize();
		
		System.out.println("Height of username button is "+un.getHeight()+"\nWidth of username button is "+un.getWidth());
		System.out.println("Height of password button is "+pwd.getHeight()+"\nWidth of password button is "+pwd.getWidth());
		if(un.getHeight()==pwd.getHeight() && un.getWidth()==pwd.getWidth())
			System.out.println("Size of Username textbox and Password textox are same");
		else
			System.out.println("Size of Username textbox and Password textox are not same");driver.close();
	}
}
             