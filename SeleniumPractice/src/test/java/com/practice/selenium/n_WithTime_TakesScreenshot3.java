package com.practice.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.asm.Advice.Local;

public class n_WithTime_TakesScreenshot3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String date = new Date().toString();
		String time=date.replace(" ", "_").replace(":","_");
	
		
		//to take screenshot of perticular web element
		TakesScreenshot ts=(TakesScreenshot)driver;
	
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/SpecificElement_"+time+".png");
		FileHandler.copy(src, dest);
		System.out.println("Screenshot taken and stored also ");
		driver.close();
	}

}
