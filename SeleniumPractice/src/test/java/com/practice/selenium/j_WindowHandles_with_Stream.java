package com.practice.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j_WindowHandles_with_Stream {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        
        // Get the parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        System.out.println("Parent Window Title: " + driver.getTitle());
        Thread.sleep(2000);

        // Open a new tab/window
        driver.findElement(By.xpath("//a[text()='Google+']")).click();
        Thread.sleep(2000);

        // Switch to child window using Streams
        Set<String> allWindows = driver.getWindowHandles();
        allWindows.stream()
                  .filter(window -> !window.equals(parentWindow)) // Skip parent window
                  .forEach(childWindow -> {
                      // Switch to child window
                      driver.switchTo().window(childWindow);
                      System.out.println("Child Window Title: " + driver.getTitle());

                      // Perform action in the child window
                      if (driver.getTitle().contains("Google")) {
                          driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Google");
                      }

                      // Return to the parent window
                      driver.switchTo().window(parentWindow);
                      System.out.println("Switched back to Parent Window");
                      driver.findElement(By.id("small-searchterms")).sendKeys("Done");
                  });

        // Close the parent window and quit the driver
        driver.quit();
    }
}
