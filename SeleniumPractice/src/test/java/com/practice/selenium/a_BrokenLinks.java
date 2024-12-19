package com.practice.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_BrokenLinks {

    public static void main(String[] args) {
        // Set path to chromedriver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the webpage
        driver.get("https://www.amazon.com");

        // Get all <a> tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        // Check each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty()) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode >= 400) {
                        System.out.println("Broken link: " + url + " - Response code: " + responseCode);
                    } else {
                        System.out.println("Valid link: " + url + " - Response code: " + responseCode);
                    }
                } catch (Exception e) {
                    System.out.println("Error checking link: " + url + " - Exception: " + e.getMessage());
                }
            } else {
                System.out.println("Empty or invalid link: " + link.getText());
            }
        }

        // Close the browser
        driver.quit();
    }
}
