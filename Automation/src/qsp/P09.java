package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='popup_menu_item_2']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//a[text()='engineering']//..//..//span[@id='type_1_billing_rate']")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()='manufacturing']//..//..//td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()='manufacturing']//..//..//td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()='testing']/../../td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[text()='support']/../../td[5]")).getText());
		driver.close();
	}

}
