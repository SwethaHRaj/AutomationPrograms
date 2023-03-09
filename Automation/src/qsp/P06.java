package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org/");
		String url = driver.getCurrentUrl();   
		if(url.equals("https://www.selenium.dev/"))
			System.out.println("Url is navigating and pass");
		else
			System.out.println("Url is not navigating and fail");
		driver.close();
	}
}           
