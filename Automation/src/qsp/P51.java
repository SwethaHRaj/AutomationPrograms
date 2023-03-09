package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P51 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}	

	public static void main(String[] args) {        // continue
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Demo4.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> options = s.getOptions();
		
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<options.size();i++) {
			al.add(options.get(i).getText());
		}
		
		HashSet<String> hs=new HashSet<String>();
		Collections.sort(al);
		System.out.println(al);
		for(int i=0;i<al.size()-1;i++) {
			if(al.get(i).equals(al.get(i+1))) {
				hs.add(al.get(i));
			}
		}
		System.out.println(hs);
		driver.close();
	}
}
		
			
				
		

	