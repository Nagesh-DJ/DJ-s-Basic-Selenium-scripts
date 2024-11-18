package com.practice.selenium;

import java.time.Duration;import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class h_AutoSuggestion_DropDown2 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'in Men’s Casual Shoes')]")).click();
		
		driver.close();
	}

}
