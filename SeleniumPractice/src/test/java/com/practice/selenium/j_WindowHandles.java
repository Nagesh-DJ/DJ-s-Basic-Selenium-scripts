package com.practice.selenium;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class j_WindowHandles {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		Thread.sleep(2000);
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println(childWindows);	
		
		for (String window : childWindows)
		{	
			Thread.sleep(2000);
			driver.switchTo().window(window);	
			if(driver.getTitle().contains("Google"))
			{
			String title1=driver.getTitle();
			System.out.println(title1);
			driver.findElement(By.xpath(" //input[@type='text']")).sendKeys("Google");
			Thread.sleep(2000);
			}

		}
	

		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

		driver.findElement(By.id("small-searchterms")).sendKeys("Done");
		Thread.sleep(2000);

		driver.close();
		
		
	
	
		
		driver.quit();
		
	}

}
