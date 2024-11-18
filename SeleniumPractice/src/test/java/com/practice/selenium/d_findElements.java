package com.practice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d_findElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//findelement
		WebElement element = driver.findElement(By.tagName("a"));
		System.out.println(element.getAttribute("href"));
		
		//findelements
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		System.out.println(elements);
		for(WebElement links: elements)
		{
			//link text and print links  
			System.out.println(links.getText());
			System.out.println(links.getAttribute("href"));
		
		}
		
		
		driver.close();
}
	
	

}
