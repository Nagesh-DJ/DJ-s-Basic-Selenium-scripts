package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class f_MouseActions4 {

	public static void main(String[] args) throws Exception
	{
		
		//clickAndHold
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		WebElement sourceElement = driver.findElement(By.id("box3"));
		WebElement targetElement = driver.findElement(By.id("box103"));
		Thread.sleep(2000);
		act.clickAndHold(sourceElement).moveToElement(targetElement).click().perform();
				
		Thread.sleep(2000);
	
		driver.close();
	}

}
