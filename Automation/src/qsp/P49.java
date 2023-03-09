package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P49 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}	

	public static void main(String[] args) {        
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Demo4.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> options = s.getOptions();
		/*
		ArrayList<String> al= new ArrayList<String>();
		for(int i=0;i<options.size();i++) {
			String str=options.get(i).getText();
			al.add(str);
		}
		Collections.sort(al);
		for(String i:al)
			System.out.println(i);
		driver.close();
		*/
	
		TreeSet<String> ts=new TreeSet<String>();
		for(int i=0;i<options.size();i++) {
			String str=options.get(i).getText();
			ts.add(str);
		}
		for(String i:ts)
			System.out.println(i);
		driver.close();
	}
}
