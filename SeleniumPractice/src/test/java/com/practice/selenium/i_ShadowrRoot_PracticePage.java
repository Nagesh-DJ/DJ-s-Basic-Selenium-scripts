package com.practice.selenium;

import java.time.Duration;import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class i_ShadowrRoot_PracticePage {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/html%20pages%20link%20for%20selenium/open%20and%20close%20shadow%20root.html\r\n"
				+ "");
		
	
		//open shadow root
		SearchContext shadowRoot = driver.findElement(By.xpath("//div/child::div[1]")).getShadowRoot();
		shadowRoot.findElement(By.id("open-btn")).click();
		Thread.sleep(2000);
		
		//closed shadow root
		driver.findElement(By.xpath("//div[@id='closed-shadow-root']")).click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
