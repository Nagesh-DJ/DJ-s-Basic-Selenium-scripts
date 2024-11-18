package com.practice.selenium;

import java.time.Duration;import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class g_KeyUp_KeyDown {

	public static void main(String[] args) throws Exception
	{
		
		//clickAndHold
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//performing composite actions
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.id("small-searchterms"));
		act.moveToElement(element).click().
		keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);	
		
		//to click on search button
		driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	
		driver.close();
	}

}
