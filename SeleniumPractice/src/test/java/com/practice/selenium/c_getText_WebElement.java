package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_getText_WebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.id("small-searchterms"));
		element.sendKeys("laptops");
		element.submit();
		
		//getter methods
		//to get text on browser
		String text = driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		System.out.println("text on browser: "+text);
		
		//to get run-time value entered in search text field
		//step1-enter value
		//step2-get value
		WebElement searchElement=driver.findElement(By.id("small-searchterms"));
					searchElement.sendKeys("Washing machine");
		String value=searchElement.getAttribute("value");
		System.out.println("value entered: "+value);
		
		String ccsValue=searchElement.getCssValue("border-bottom-color");
		System.out.println("search element : "+ccsValue);
	
		driver.quit();
		
		
		
		
	}
}
