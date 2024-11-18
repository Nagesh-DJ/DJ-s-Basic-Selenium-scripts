package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_Verification_Webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//verification methods
	//check whether excellent radio is button is selected or not
		//step1-select then check
		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.id("pollanswers-1")).isSelected())
		{
			System.out.println("yes,Its is selected");
		}
		else
		{
			System.out.println("Sorry not selected");
		}
		
		//check search field is displayed or not
		if(driver.findElement(By.id("small-searchterms")).isDisplayed())
		{
			System.out.println("yes its displayed");
			driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		}
		else
		{
			System.out.println("search field is not displayed");
		}
		
		//check search button is enabled or not if yes then click
		
		if(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled())
		{
			System.out.println("yes,search button is enable");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		else
		{
			System.out.println("search button is not enabled");
		}
	
		
		driver.close();
	}

}
