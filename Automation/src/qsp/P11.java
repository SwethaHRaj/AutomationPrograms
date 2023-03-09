package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.findElement(By.xpath("//p[text()='C#']/../p[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='Ruby']/../p[3]/a     ")).getAttribute("href"));
		System.out.println(driver.findElement(By.xpath("//p[text()='Python']/../p[4]/a")).getAttribute("href"));
		driver.close();
	}

}
