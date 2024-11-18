package com.practice.selenium;

import java.time.Duration;import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class i_ShadowrRoot_open {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		
		driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]"))
		.click();
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow Root')])[2]"))
		.click();
		
		//find Shadow host for username
		SearchContext shadowRoot = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadowRoot.findElement(By.cssSelector("input[type='text']")).sendKeys("nagesh");
		Thread.sleep(2000);
		
		//find shadow host for password
		SearchContext shadowRoot2 = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadowRoot2.findElement(By.cssSelector("input[type='text']")).sendKeys("DJ DJ DJD DJD DJD");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
