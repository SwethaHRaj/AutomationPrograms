package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P43 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Admin/Desktop/Demo4.html");
		WebElement we=driver.findElement(By.id("mtr"));
		Select s=new Select(we);
		s.selectByIndex(0);
		s.selectByValue("p");
		s.selectByVisibleText("kharabath");
		s.deselectByVisibleText("kharabath");
		if(s.isMultiple())
			s.deselectAll();
		WebElement we1=driver.findElement(By.id("checkpost"));
		Select s1=new Select(we1);
		s1.deselectByIndex(0);
		s1.deselectByValue("pu");
		

	}

}
