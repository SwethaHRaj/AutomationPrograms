package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P50 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}	

	public static void main(String[] args) {        
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Demo4.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> options = s.getOptions();
		
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<options.size();i++) {
			String str=options.get(i).getText();
			hs.add(str);
		}
		for(String i:hs)
			System.out.println(i);
		driver.close();
	}
}
