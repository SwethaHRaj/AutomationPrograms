package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P04 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		P03.testA(driver1);
		WebDriver driver2=new EdgeDriver();
		P03.testA(driver2);
	}
}           
