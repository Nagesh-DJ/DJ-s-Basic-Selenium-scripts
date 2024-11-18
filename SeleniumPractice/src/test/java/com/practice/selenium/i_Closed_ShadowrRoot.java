package com.practice.selenium;

import java.time.Duration;import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class i_Closed_ShadowrRoot {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("nagesh").perform();
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("DJDJD").perform();
		Thread.sleep(1000);

		driver.close();
		
		
		
		
	}

}
