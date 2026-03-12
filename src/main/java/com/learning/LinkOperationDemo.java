package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperationDemo {
    public static void main(String[] args) {
        //Open Google Chrome Browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize the browser
        driver.manage().window().maximize();

        //Open application
        driver.get("https://www.facebook.com/");

        //Identify link
        WebElement link = driver.findElement(By.linkText("Forgot password?"));

        //Display status of link
        boolean isDisplayStatus = link.isDisplayed();
        System.out.println("Is displayed status is: " + isDisplayStatus);

        //Enable status
        boolean isEnabledStatus = link.isEnabled();
        System.out.println("Is enabled status is: " + isEnabledStatus);

        //Get the link name
        String linkName = link.getText();
        System.out.println("Link name is: " + linkName);

        //Click on link
        link.click();

        //Driver quit
        driver.quit();
    }
}


