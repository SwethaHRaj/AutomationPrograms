package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P45 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Admin/Desktop/Demo4.html");
		WebElement we1=driver.findElement(By.id("checkpost"));
		Select s1=new Select(we1);
		List<WebElement> wel = s1.getAllSelectedOptions();
		for(WebElement i:wel)
			System.out.println(i.getText());
		driver.close();
		

	}

}
