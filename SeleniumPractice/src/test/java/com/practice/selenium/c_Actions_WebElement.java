package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_Actions_WebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.id("small-searchterms"));
		element.sendKeys("laptops");
		Thread.sleep(2000);
		element.clear();
		Thread.sleep(2000);
		element.sendKeys("mobile");
		element.submit();
		
		WebElement el1=driver.findElement(By.id("small-searchterms"));
		el1.sendKeys("Tv");
		
		WebElement el2=driver.findElement(By.xpath("//input[@type='submit']"));
		el2.click();
		
		driver.quit();
		
	}
}
