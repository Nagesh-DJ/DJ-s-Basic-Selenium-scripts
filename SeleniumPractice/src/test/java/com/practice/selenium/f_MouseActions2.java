package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class f_MouseActions2 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		//right click on 1st button in given website
		WebElement element1=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(element1).perform();
		
		//double click
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(element).perform();
		Thread.sleep(2000);
		
		//to handle alert after double click
		driver.switchTo().alert().accept();
	
		Thread.sleep(1000);
		
		//driver.close();
		
		//just for practice right-click-->click on delete -->alert ok
		act.contextClick(element1).perform();
		WebElement deletelement = driver.findElement(By.xpath("//span[text()='Delete']"));
		Thread.sleep(1000);
		act.moveToElement(deletelement).click().perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.close();
	}

}
