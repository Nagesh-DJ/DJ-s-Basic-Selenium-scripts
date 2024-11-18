package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l_Alert_2_Confirmation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//enter 1234 on customer ID button then click ok  and delete 
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@name='submit']")).click();

		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
				
	driver.quit();
	
	
	
	
}
}
