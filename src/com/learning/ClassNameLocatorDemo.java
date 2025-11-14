package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassNameLocatorDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64 2/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Open Facebook Login Page
        driver.get("https://www.facebook.com/");

        //Capture all text boxes of Login Page
        List<WebElement> allTextboxes = driver.findElements(By.className("inputtext"));
        System.out.println("Total boxes are : " + allTextboxes.size());
        allTextboxes.get(0).sendKeys("test@test.com");
        allTextboxes.get(1).sendKeys("test123");

    }

}
