package com.practice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Z_PrintTop_5_LatestNews {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	
	driver.get("https://www.deccanherald.com/");
	WebElement header = driver.findElement(By.xpath("//a[contains(text(),'Trending')]"));
	System.out.println(header.getText());
	header.click();
	List<WebElement> elements = driver.findElements(By.xpath("//h2[@class='headline headline-type-2 line-clamp line-clamp-3 PyI5Q cP-2u']"));
	System.out.println("TOP 5 News of the DAY.....");
	for(int i=0;i<5;i++)
	{
		
		String news = elements.get(i).getText();
		System.out.println(news);
	}
	
	
	
	
	
	//to clik on a perticular link
	boolean flag=false;
	for(int i=0;i<5;i++)
	{
		
		if(elements.get(i).getText().contains("Monkey"))
		{
			flag=true;
		 elements.get(i).click();
		 System.out.println("Yes such news present..");

		}
		
	}
	
	if(flag==false)
	{
		System.out.println("sorry such news was not available..");
	}
	driver.quit();

}
}
