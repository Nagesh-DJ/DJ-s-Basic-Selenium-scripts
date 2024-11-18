package com.practice.selenium;

import java.time.Duration;import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class g_scrollByAmount_scrollToElement {

public static void main(String[] args) throws Exception{
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	//scroll
	Actions act=new Actions(driver);
	act.scrollByAmount(0, 100).perform();
	Thread.sleep(2000);
	
	//scroll till information button
	WebElement element = driver.findElement(By.xpath("//h3[text()='Information']"));
	act.scrollToElement(element).perform();
	Thread.sleep(5000);
	//driver.close();
}
}
