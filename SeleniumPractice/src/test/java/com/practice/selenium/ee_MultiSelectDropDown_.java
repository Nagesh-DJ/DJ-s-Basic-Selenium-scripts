package com.practice.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ee_MultiSelectDropDown_ {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/User/Desktop/ActualMultiSelect.html");
	
	//click 
	driver.findElement(By.xpath("//button[text()='Select Fruits']")).click();
	
	WebElement element = driver.findElement(By.id("fruits"));
	Select select=new Select(element);
    List<WebElement> options = select.getOptions();
    for (int i = 0; i < options.size(); i++) 
    {
		select.selectByIndex(i);
		Thread.sleep(1000);
		
	}
    
    List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
   for (WebElement webElement : allSelectedOptions) 
   {
	  System.out.println(webElement.getText());
   }
   Thread.sleep(1000);
   
   select.deselectAll();
    driver.close();
}

}
