package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) 
	{
		System.out.println("=== Hello ! Integration of Github with Jenkins ===");
	
		System.setProperty("webdriver.gecko.driver", "F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		
		WebDriver k = new FirefoxDriver();
		
		k.get("https://www.facebook.com");
		
		System.out.println("======="+k.getTitle()+"==========");
		
		k.close();
		
	}

}
