package qsp;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean res = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(res)
			System.out.println("Checkbox is selected");
		else
			System.out.println("Checkbox is not selected");
		driver.close();
	}
}
