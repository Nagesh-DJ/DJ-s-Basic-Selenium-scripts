package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l_Alert_1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	//click on search button without entering anything
	driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("alert present");
		driver.switchTo().alert().accept();
		System.out.println("alret handled");
		Thread.sleep(2000);

		//enter mobile in search text field
		driver.findElement(By.id("small-searchterms")).sendKeys("Alert handled");
		Thread.sleep(2000);
		
	driver.quit();
	
	
	
}
}
