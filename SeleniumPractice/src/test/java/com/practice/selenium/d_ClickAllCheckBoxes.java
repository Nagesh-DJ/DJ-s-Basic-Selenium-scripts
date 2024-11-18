package com.practice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_ClickAllCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on all radio buttons
		//check all radio buttons are selected
		List<WebElement> elements = driver.findElements(By.xpath(" //input[@type='radio']"));
		for (WebElement webElement : elements) 
		{
			
			webElement.click();
			Thread.sleep(2000);
			System.out.println(webElement.isSelected());
		}
		
	driver.quit();
		
	}
}
