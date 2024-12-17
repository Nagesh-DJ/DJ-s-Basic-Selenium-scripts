package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class z_GoogleAutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com/");
	driver.findElement(By.id("APjFqb")).sendKeys("Puneet");
	
	Thread.sleep(2000);
	List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox'] // li[@data-view-type='1']"));
	System.out.println("no of auto-suggestions: "+elements.size());
	elements.get(1).click();
	}
 }
