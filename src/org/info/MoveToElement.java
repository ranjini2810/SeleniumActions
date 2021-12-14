package org.info;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToElement {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivaprakash\\eclipse-workspace\\SeleniumAction\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	 driver.get("http://www.greenstech.in/selenium-course-content.html");		
	 
	 
	 
	}
	
}
