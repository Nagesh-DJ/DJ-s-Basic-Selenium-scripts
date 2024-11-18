package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e_SelectClass_DropDown {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	//click on books link to get drop-down
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	
	//select drop-down
	WebElement webElement=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Select select=new Select(webElement);
	/*
	 * select.selectByIndex(5);
	 *  Thread.sleep(2000);
	 */
//	select.selectByVisibleText("Price: Low to High");
//	Thread.sleep(2000);
	
	select.selectByValue("https://demowebshop.tricentis.com/books?orderby=10&pagesize=12&viewmode=list");
	driver.close();
	
	}
}
