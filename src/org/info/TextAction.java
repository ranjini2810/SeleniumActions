package org.info;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextAction {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivaprakash\\eclipse-workspace\\SeleniumAction\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		
		
		//to maximize the screen
		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobile");
		
		   Robot r = new Robot();
		for (int i = 0; i <=5; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			
		r.keyRelease(KeyEvent.VK_DOWN);	
		Thread.sleep(3000);
	//	search.click();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_ENTER);
//				
//	
//		driver.get("https://www.facebook.com/");
//		
//				
//		WebElement userid = driver.findElement(By.id("email"));
//		userid.sendKeys("siva2015");
//		
//		
//		//to create objects for actions 
//		Actions a =new Actions(driver);
//		
//		//to perform doubleclick
//		a.doubleClick(userid).perform();
//		Thread.sleep(3000);
//
//		//to perform rightclick
//		a.contextClick(userid).perform();
//		
//		
//	Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);	
//		
//		WebElement pass = driver.findElement(By.id("pass"));
//		
//		pass.sendKeys("qwertyu");
//				
//		
//		WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
//		login.click();
		
		
	}

}
