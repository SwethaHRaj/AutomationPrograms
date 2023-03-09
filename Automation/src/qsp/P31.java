package qsp;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P31 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
	    driver.findElement(By.name("q")).sendKeys("selenium");
	    List<WebElement> wes = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	    int count=wes.size();
	    System.out.println("count is "+count);
	    for(WebElement i:wes) {
	    	System.out.println(i.getText());
	    }
	    wes.get(count-1).click();
		driver.close();
	}
}
             