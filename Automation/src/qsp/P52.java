package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P52 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}	

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item to find");
		String n=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Demo4.html");
		WebElement cplist = driver.findElement(By.id("checkpost"));
		Select s=new Select(cplist);
		List<WebElement> options = s.getOptions();
		
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<options.size();i++) {
			al.add(options.get(i).getText());
		}
		
		int i=0,a=0;
		while(i<al.size()) {
			if(n.equals(al.get(i))) {
				a++;
				break;
			}	
			else 	
				i++;
		}
		if(a>0)
		System.out.println(n+" is present");
		else
		System.out.println(n+" is not present");
		driver.close();
	}
}
	