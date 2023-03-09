package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P56 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care/");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).sendKeys("123");
		WebElement wem = driver.findElement(By.className("ui-datepicker-month"));
		Select sm=new Select(wem);
		sm.selectByVisibleText("Mar");
		WebElement wey=driver.findElement(By.className("ui-datepicker-year"));
		Select sy = new Select(wey);
		sy.selectByVisibleText("1992");
		driver.findElement(By.xpath("//a[text()='4']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		String s= driver.findElement(By.id("policynumberError")).getText();
		if(s.equals("Please enter valid Policy No."))
			System.out.println("Text \"Please enter valid Policy No.\" is displaying");
		else
			System.out.println("Text \"Please enter valid Policy No.\" is not displaying");
		driver.close(); 
		
	}
}
