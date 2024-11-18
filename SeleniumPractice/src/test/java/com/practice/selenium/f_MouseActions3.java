package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class f_MouseActions3 {

	public static void main(String[] args) throws Exception
	{
		
		//dragAndDrop
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		WebElement sourceElement = driver.findElement(By.id("box3"));
		WebElement targetElement = driver.findElement(By.id("box103"));
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement, targetElement).perform();
		
		
		WebElement sourceElement2 = driver.findElement(By.id("box4"));
		WebElement targetElement2 = driver.findElement(By.id("box104"));
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement2, targetElement2).perform();
		
		
		WebElement sourceElement3 = driver.findElement(By.id("box1"));
		WebElement targetElement3 = driver.findElement(By.id("box101"));
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement3, targetElement3).perform();
		
		WebElement sourceElement4 = driver.findElement(By.id("box2"));
		WebElement targetElement4 = driver.findElement(By.id("box102"));
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement4, targetElement4).perform();
		
		
		Thread.sleep(2000);
	
		driver.close();
	}

}
